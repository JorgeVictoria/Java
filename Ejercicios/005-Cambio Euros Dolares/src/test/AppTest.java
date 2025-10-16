package test;

import static org.testng.Assert.assertEquals;

import app.App;
import org.testng.annotations.Test;

import java.io.*;
import java.lang.reflect.Method;

public class AppTest {

    @Test
    void testCalcularCambio() throws Exception {
        Method metodo = App.class.getDeclaredMethod("calcularCambio", double.class, double.class);
        metodo.setAccessible(true);

        double cantidad = 100.0;
        double tipoCambio = 1.08;
        double esperado = cantidad * tipoCambio;

        double resultado = (double) metodo.invoke(null, cantidad, tipoCambio);
        assertEquals(esperado, resultado, 0.0001, "El cambio debe ser cantidad * tipoCambio");
    }

    @Test
    void testLeerValorEntradaCorrecta() throws Exception {
        // Simulamos que el usuario introduce 50.5
        String input = "50.5\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
        metodo.setAccessible(true);

        double resultado = (double) metodo.invoke(null, "Euros: ");
        assertEquals(50.5, resultado, 0.001, "Debe leer correctamente el valor 50.5");

        System.setIn(originalIn);
    }

    @Test
    void testLeerValorInvalidoYValido() throws Exception {
        // Simulamos que el usuario introduce un texto no válido, luego un número válido
        String input = "abc\n100.0\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
        metodo.setAccessible(true);

        double resultado = (double) metodo.invoke(null, "Tipo de cambio: ");
        assertEquals(100.0, resultado, 0.001, "Debe ignorar el valor no válido y aceptar el segundo correcto");

        System.setIn(originalIn);
    }
}
