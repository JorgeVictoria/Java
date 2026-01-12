package test;

import static org.junit.jupiter.api.Assertions.*;

import app.App;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Method;

public class AppTest {

    @Test
    void testCambiarValores() throws Exception {
        // Asignamos valores iniciales mediante reflexión
        var campoA = App.class.getDeclaredField("numA");
        var campoB = App.class.getDeclaredField("numB");
        campoA.setAccessible(true);
        campoB.setAccessible(true);

        campoA.setInt(null, 10);
        campoB.setInt(null, 20);

        // Llamamos a cambiarValores
        Method metodo = App.class.getDeclaredMethod("cambiarValores");
        metodo.setAccessible(true);
        metodo.invoke(null);

        // Verificamos que los valores se intercambiaron
        assertEquals(20, campoA.getInt(null));
        assertEquals(10, campoB.getInt(null));
    }

    @Test
    void testLeerValorCorrecto() throws Exception {
        // Simulamos la entrada del usuario: 15
        String input = "15\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
        metodo.setAccessible(true);

        int resultado = (int) metodo.invoke(null, "numA : ");
        assertEquals(15, resultado);

        System.setIn(originalIn);
    }

    @Test
    void testLeerValorIncorrectoYPositivo() throws Exception {
        // Simulamos entrada inválida seguida de negativa y luego correcta
        String input = "abc\n-5\n30\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
        metodo.setAccessible(true);

        int resultado = (int) metodo.invoke(null, "numA : ");
        assertEquals(30, resultado);

        System.setIn(originalIn);
    }

    @Test
    void testSalidaConsolaDespuesDeCambio() throws Exception {
        // Simulamos la entrada del usuario: numA=7, numB=12
        String input = "7\n12\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Capturamos la salida por consola
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        App.main(new String[]{});

        // Restauramos System.in y System.out
        System.setIn(originalIn);
        System.setOut(originalOut);

        String salida = outputStream.toString();

        // Verificamos que los valores se imprimieron intercambiados
        assertTrue(salida.contains("numA = 12"));
        assertTrue(salida.contains("numB = 7"));
    }
}
