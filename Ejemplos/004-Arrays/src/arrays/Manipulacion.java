package arrays;

import java.util.Arrays;

public class Manipulacion {
    public static void main(String[] args) {
        // Declaración e inicialización de un array de enteros
        int[] numeros = {5, 2, 9, 1, 7};

        // Uso de length
        System.out.println("El array 'numeros' tiene " + numeros.length + " elementos.");
        System.out.println("Array original: " + Arrays.toString(numeros));

        // 1. Ordenar el array
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // 2. Búsqueda binaria (array debe estar ordenado)
        int posicion = Arrays.binarySearch(numeros, 7);
        System.out.println("El número 7 está en la posición: " + posicion);

        // 3. Rellenar un array con un valor fijo
        int[] rellenado = new int[5];
        System.out.println("\nEl array 'rellenado' tiene " + rellenado.length + " elementos.");
        Arrays.fill(rellenado, 3);
        System.out.println("Array rellenado: " + Arrays.toString(rellenado));

        // 4. Copiar arrays con copyOf
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        System.out.println("\nCopia del array con copyOf: " + Arrays.toString(copia));

        // 5. Copiar un rango de un array
        // desde índice 1 hasta 3
        int[] subarray = Arrays.copyOfRange(numeros, 1, 4);
        System.out.println("Subarray (posiciones 1 a 3): " + Arrays.toString(subarray));
        System.out.println("El subarray tiene " + subarray.length + " elementos.");

        // 6. Comparar arrays
        System.out.println("\n¿numeros y copia son iguales? " + Arrays.equals(numeros, copia));
        System.out.println("¿numeros y subarray son iguales? " + Arrays.equals(numeros, subarray));

        // 7. Clonar un array
        // copia idéntica
        int[] clon = numeros.clone();
        System.out.println("\nClon del array: " + Arrays.toString(clon));
        System.out.println("¿numeros y clon son el mismo objeto? " + (numeros == clon));
        System.out.println("¿numeros y clon tienen el mismo contenido? " + Arrays.equals(numeros, clon));

        // 8. Arrays multidimensionales
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("\nMatriz con Arrays.deepToString: " + Arrays.deepToString(matriz));
        System.out.println("La matriz tiene " + matriz.length + " filas.");
        System.out.println("La primera fila de la matriz tiene " + matriz[0].length + " columnas.");
    }
}
