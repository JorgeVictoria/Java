package test;

import app.App;
import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.assertTrue;

public class AppTest {

    @Test
    void testOperacionesConsola() {
        // Simulamos la entrada del usuario: numA=12, numB=5
        String input = "12\n5\n";
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

        // Obtenemos la salida como String
        String salida = outputStream.toString();

        // Verificamos que la salida contiene los resultados correctos
        assertTrue(salida.contains("12 + 5 = 17"));
        assertTrue(salida.contains("12 - 5 = 7"));
        assertTrue(salida.contains("12 * 5 = 60"));
        assertTrue(salida.contains("12 : 5 = 2"));
        assertTrue(salida.contains("Resto división : 2"));
    }
}
