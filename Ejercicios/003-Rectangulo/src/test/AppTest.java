package test;

import static org.testng.Assert.assertEquals;

import app.App;
import org.testng.annotations.Test;

import java.io.*;
import java.lang.reflect.Method;

public class AppTest {

    @Test
    void testCalcularArea() throws Exception {
        Method metodo = App.class.getDeclaredMethod("calcularArea", double.class, double.class);
        metodo.setAccessible(true);
        double resultado = (double) metodo.invoke(null, 5.0, 4.0);
        assertEquals(20.0, resultado, 0.001, "El área debe ser base * altura");
    }

    @Test
    void testCalcularPerimetro() throws Exception {
        Method metodo = App.class.getDeclaredMethod("calcularPerimetro", double.class, double.class);
        metodo.setAccessible(true);
        double resultado = (double) metodo.invoke(null, 5.0, 4.0);
        assertEquals(18.0, resultado, 0.001, "El perímetro debe ser 2*(base + altura)");
    }

    @Test
    void testLeerValorEntradaCorrecta() throws Exception {
        String input = "7.5\n"; // simulamos que el usuario escribe 7.5 y presiona Enter
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
        metodo.setAccessible(true);
        double resultado = (double) metodo.invoke(null, "base: ");
        assertEquals(7.5, resultado, 0.001, "Debe leer correctamente el valor 7.5");

        System.setIn(originalIn); // restauramos la entrada original
    }

    @Test
    void testLeerValorInvalidoYValido() throws Exception {
        // Simulamos que el usuario primero introduce un texto no válido, luego un número válido
        String input = "abc\n10.0\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method metodo = App.class.getDeclaredMethod("leerValor", String.class);
        metodo.setAccessible(true);
        double resultado = (double) metodo.invoke(null, "altura: ");
        assertEquals(10.0, resultado, 0.001, "Debe ignorar el valor no válido y leer el segundo correcto");

        System.setIn(originalIn);
    }
}
