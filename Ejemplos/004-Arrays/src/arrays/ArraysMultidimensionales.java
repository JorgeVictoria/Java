package arrays;

import java.util.Arrays;

public class ArraysMultidimensionales {
    public static void main(String[] args) {
        // 1. Array bidimensional de enteros (matriz fija 3x3)
        int[][] matrizEnteros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 2. Array bidimensional de decimales
        double[][] notas = {
                {8.5, 7.2, 9.0},
                {6.8, 5.5, 7.9}
        };

        // 3. Array bidimensional de Strings
        String[][] nombres = {
                {"Ana", "Luis", "María"},
                {"Carlos", "Lucía", "Pedro"}
        };

        // 4. Array irregular (jagged array) de caracteres
        char[][] letras = {
                {'A', 'B'},
                {'C', 'D', 'E', 'F'},
                {'G'}
        };

        // ---- Mostrar contenido con Arrays.deepToString ----
        System.out.println("Matriz de enteros: " + Arrays.deepToString(matrizEnteros));
        System.out.println("Notas: " + Arrays.deepToString(notas));
        System.out.println("Nombres: " + Arrays.deepToString(nombres));
        System.out.println("Letras (array irregular): " + Arrays.deepToString(letras));

        // ---- Recorrer con bucles tradicionales ----
        System.out.println("\nRecorriendo matriz de enteros:");
        for (int i = 0; i < matrizEnteros.length; i++) {          // filas
            for (int j = 0; j < matrizEnteros[i].length; j++) {   // columnas
                System.out.print(matrizEnteros[i][j] + " ");
            }
            System.out.println();
        }

        // ---- Recorrer con for-each ----
        System.out.println("\nRecorriendo nombres:");
        for (String[] fila : nombres) {
            for (String nombre : fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

        // ---- Ejemplo de array irregular ----
        System.out.println("\nArray irregular de letras:");
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Fila " + i + " (longitud " + letras[i].length + "): " + Arrays.toString(letras[i]));
        }
    }
}
