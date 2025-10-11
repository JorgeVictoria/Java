package test;

import app.App;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class AppTest {

    private static final PrintStream originalOut = System.out;
    private static final InputStream originalIn = System.in;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    // === Test para getCosteFabricacion ===
    @Test
    public void testGetCosteFabricacion_InputValido() throws Exception {
        String simulatedInput = "250\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        var method = App.class.getDeclaredMethod("getCosteFabricacion");
        method.setAccessible(true);
        double result = (double) method.invoke(null);

        assertEquals(250.0, result, 0.001, "Debe devolver el valor introducido por el usuario.");
    }

    @Test
    public void testGetCosteFabricacion_InputInvalidoYLuegoValido() throws Exception {
        // Simula primero una letra (error), luego un número correcto
        String simulatedInput = "abc\n150\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        var method = App.class.getDeclaredMethod("getCosteFabricacion");
        method.setAccessible(true);
        double result = (double) method.invoke(null);

        String salida = outContent.toString();
        assertTrue(salida.contains("El valor introducido no es correcto"), 
            "Debe mostrar mensaje de error cuando el input no es numérico.");
        assertEquals(150.0, result, 0.001, "Debe devolver el valor válido introducido finalmente.");
    }

    // === Tests lógicos ===

    @Test
    public void testGetMargenGananciaVendedor() {
        double margen = invokeGetMargenGananciaVendedor(100.0);
        assertEquals(30.0, margen, 0.001);
    }

    @Test
    public void testGetImpuestos() {
        double impuestos = invokeGetImpuestos(100.0, 30.0);
        assertEquals(27.3, impuestos, 0.001);
    }

    @Test
    public void testGetPrecioFinal() {
        double precioFinal = invokeGetPrecioFinal(100.0, 30.0, 27.3);
        assertEquals(157.3, precioFinal, 0.001);
    }

    @Test
    public void testGetTipoProductoNormal() {
        String tipo = invokeGetTipoProducto(500.0);
        assertEquals("NORMAL", tipo);
    }

    @Test
    public void testGetTipoProductoLujo() {
        String tipo = invokeGetTipoProducto(800.0);
        assertEquals("lUJO", tipo);
    }

    // === Métodos auxiliares de reflexión ===

    private double invokeGetMargenGananciaVendedor(double coste) {
        try {
            var method = App.class.getDeclaredMethod("getMargenGananciaVendedor", double.class);
            method.setAccessible(true);
            return (double) method.invoke(null, coste);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private double invokeGetImpuestos(double coste, double margen) {
        try {
            var method = App.class.getDeclaredMethod("getImpuestos", double.class, double.class);
            method.setAccessible(true);
            return (double) method.invoke(null, coste, margen);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private double invokeGetPrecioFinal(double coste, double margen, double impuestos) {
        try {
            var method = App.class.getDeclaredMethod("getPrecioFinal", double.class, double.class, double.class);
            method.setAccessible(true);
            return (double) method.invoke(null, coste, margen, impuestos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String invokeGetTipoProducto(double precioFinal) {
        try {
            var method = App.class.getDeclaredMethod("getTipoProducto", double.class);
            method.setAccessible(true);
            return (String) method.invoke(null, precioFinal);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
