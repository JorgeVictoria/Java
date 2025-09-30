package arrays;

public class Declaracion {
    public static void main(String[] args) {
        // 1. Declaración e inicialización directa
        int[] numeros = {1, 2, 3, 4, 5};

        // 2. Declaración con tamaño fijo e inicialización posterior
        String[] nombres = new String[3];
        nombres[0] = "Ana";
        nombres[1] = "Carlos";
        nombres[2] = "Lucía";

        // 3. Declaración e inicialización en dos pasos
        double[] precios;
        precios = new double[]{10.5, 20.75, 30.0};

        // 4. Array de caracteres (inicializado con literales)
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        // ---- Mostrar contenido de los arrays ----
        System.out.println("Array de números:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\n");

        // bucle for-each
        System.out.println("Array de nombres:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }

        System.out.println("\nArray de precios:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        System.out.println("\nArray de vocales:");
        for (char v : vocales) {
            System.out.print(v + " ");
        }
    }
}
