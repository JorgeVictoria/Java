package test;

import static org.testng.Assert.assertEquals;

import app.App;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;

public class AppTest {

    @Test
    void testCalcularNotaMedia() throws Exception {
        double[] notas1 = {10, 8, 9};
        double[] notas2 = {5, 5, 5};
        double[] notas3 = {4.5, 3.5, 6};

        Method method = App.class.getDeclaredMethod("calcularNotaMedia", double[].class);
        method.setAccessible(true);

        int resultado1 = (int) method.invoke(null, (Object) notas1);
        int resultado2 = (int) method.invoke(null, (Object) notas2);
        int resultado3 = (int) method.invoke(null, (Object) notas3);

        assertEquals(9, resultado1);
        assertEquals(5, resultado2);
        assertEquals(5, resultado3);
    }

    @Test
    void testObtenerNotaFinal() throws Exception {
        Method method = App.class.getDeclaredMethod("obtenerNotaFinal", int.class);
        method.setAccessible(true);

        String aprobado = (String) method.invoke(null, 6);
        String suspenso = (String) method.invoke(null, 4);

        assertEquals("APROBADO", aprobado);
        assertEquals("SUSPENSO", suspenso);
    }

    @Test
    void testLeerNotaConEntradaValida() throws Exception {
        // Simulamos que el usuario escribe "7.5" y pulsa Enter
        String input = "7.5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method method = App.class.getDeclaredMethod("leerNota", String.class);
        method.setAccessible(true);

        double nota = (double) method.invoke(null, "Primer Trimestre: ");
        assertEquals(7.5, nota);
    }

    @Test
    void testLeerNotaConEntradaInvalidaYValida() throws Exception {
        // Simulamos una entrada inválida (texto) y luego una válida (8)
        String input = "hola\n8\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Method method = App.class.getDeclaredMethod("leerNota", String.class);
        method.setAccessible(true);

        double nota = (double) method.invoke(null, "Segundo Trimestre: ");
        assertEquals(8.0, nota);
    }
}
