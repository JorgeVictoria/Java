package test;

import static org.testng.Assert.assertEquals;

import app.App;
import org.testng.annotations.Test;

import java.io.*;
import java.lang.reflect.Method;

public class AppTest {

    @Test
    void testCalcularResultadoPar() throws Exception {
        Method metodo = App.class.getDeclaredMethod("calcularResultado", int.class);
        metodo.setAccessible(true);

        int num = 4;
        String resultado = (String) metodo.invoke(null, num);
        assertEquals("PAR", resultado, "4 debe ser PAR");
    }

    @Test
    void testCalcularResultadoImpar() throws Exception {
        Method metodo = App.class.getDeclaredMethod("calcularResultado", int.class);
        metodo.setAccessible(true);

        int num = 7;
        String resultado = (String) metodo.invoke(null, num);
        assertEquals("IMPAR", resultado, "7 debe ser IMPAR");
    }

    @Test
    void testLeerValorEntradaCorrecta() throws Exception {
        // Simulamos que el usuario introduce 10
        String input = "10\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor");
        metodo.setAccessible(true);

        int resultado = (int) metodo.invoke(null);
        assertEquals(10, resultado, "Debe leer correctamente el valor 10");

        System.setIn(originalIn);
    }

    @Test
    void testLeerValorInvalidoYValido() throws Exception {
        // Simulamos que el usuario introduce primero un texto no válido y luego un número válido
        String input = "abc\n5\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor");
        metodo.setAccessible(true);

        int resultado = (int) metodo.invoke(null);
        assertEquals(5, resultado, "Debe ignorar el valor no válido y aceptar el segundo correcto");

        System.setIn(originalIn);
    }
}
