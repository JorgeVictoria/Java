package test;

import static org.testng.Assert.assertEquals;

import app.App;
import org.testng.annotations.Test;

import java.io.*;
import java.lang.reflect.Method;

public class AppTest {

    @Test
    void testCalcularArea() throws Exception {
        // Accedemos al método privado calcularArea(double)
        Method metodo = App.class.getDeclaredMethod("calcularArea", double.class);
        metodo.setAccessible(true);

        double radio = 5.0;
        double esperado = Math.PI * Math.pow(radio, 2);
        double resultado = (double) metodo.invoke(null, radio);

        assertEquals(esperado, resultado, 0.0001, "El área debe ser π * r²");
    }

    @Test
    void testCalcularPerimetro() throws Exception {
        // Accedemos al método privado calcularPerimetro(double)
        Method metodo = App.class.getDeclaredMethod("calcularPerimetro", double.class);
        metodo.setAccessible(true);

        double radio = 5.0;
        double esperado = 2 * Math.PI * radio;
        double resultado = (double) metodo.invoke(null, radio);

        assertEquals(esperado, resultado, 0.0001, "El perímetro debe ser 2 * π * r");
    }

    @Test
    void testLeerValorEntradaCorrecta() throws Exception {
        // Simulamos que el usuario escribe 7.5
        String input = "7.5\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
        metodo.setAccessible(true);
        double resultado = (double) metodo.invoke(null, "Radio: ");

        assertEquals(7.5, resultado, 0.001, "Debe leer correctamente el valor 7.5");

        System.setIn(originalIn);
    }

    @Test
    void testLeerValorInvalidoYValido() throws Exception {
        // Simulamos que el usuario introduce texto no válido y luego un número correcto
        String input = "abc\n10.0\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
        metodo.setAccessible(true);
        double resultado = (double) metodo.invoke(null, "Radio: ");

        assertEquals(10.0, resultado, 0.001, "Debe ignorar el valor no válido y aceptar el segundo correcto");

        System.setIn(originalIn);
    }
}
