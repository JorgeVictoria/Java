package test;

import static org.junit.jupiter.api.Assertions.*;

import app.App;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Method;

public class AppTest {

    @Test
    void testMediaYSalida() {
        // Simulamos la entrada del usuario: numA=10, numB=20, numC=30
        String input = "10\n20\n30\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Capturamos la salida por consola
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Ejecutamos el main de App
        App.main(new String[]{});

        // Restauramos System.in y System.out
        System.setIn(originalIn);
        System.setOut(originalOut);

        String salida = outputStream.toString();

        // Calculamos la media esperada
        double mediaEsperada = (10 + 20 + 30) / 3.0;

        // Verificamos que la media se imprimió correctamente
        assertTrue(salida.contains(String.format("Media: %.2f", mediaEsperada)));
    }

    @Test
    void testLeerValorConEntradaIncorrecta() {
        // Simulamos entrada inválida seguida de entrada válida
        String input = "abc\n-5\n15\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Invocamos el método privado leerValor mediante reflexión
            Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
            metodo.setAccessible(true);
            int resultado = (int) metodo.invoke(null, "numA: ");
            assertEquals(15, resultado, "Debe aceptar solo el valor positivo correcto");
        } catch (Exception e) {
            fail("Error al invocar leerValor: " + e.getMessage());
        } finally {
            // Restauramos System.in y System.out
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}
