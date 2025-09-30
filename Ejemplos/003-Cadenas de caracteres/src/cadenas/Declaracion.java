package cadenas;

public class Declaracion {

    public static void main(String[] args) {
        // 1. Declaración directa (forma más común)
        String saludo = "Hola Mundo";

        // 2. Declaración con 'new' (constructor explícito)
        String nombre = new String("Carlos");

        // 3. A partir de un array de caracteres
        char[] letras = { 'J', 'a', 'v', 'a' };
        String lenguaje = new String(letras);

        // 4. Concatenación de Strings
        String mensaje = saludo + ", mi nombre es " + nombre + " y programo en " + lenguaje;

        // 5. Uso de métodos de String
        int longitud = saludo.length();
        char primeraLetra = nombre.charAt(0);
        boolean contiene = saludo.contains("Mundo");
        String mayusculas = saludo.toUpperCase();
        String minusculas = saludo.toLowerCase();

        // 6. Cadena multilínea (text block, desde Java 15)
        String poema = """
                Rosa roja, cielo azul,
                programar en Java
                siempre es de gran virtud.
                """;

        // ---- Imprimir resultados ----
        System.out.println("Saludo: " + saludo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje creado desde char[]: " + lenguaje);
        System.out.println("Mensaje concatenado: " + mensaje);
        System.out.println("Longitud de saludo: " + longitud);
        System.out.println("Primera letra del nombre: " + primeraLetra);
        System.out.println("¿Saludo contiene 'Mundo'? " + contiene);
        System.out.println("Saludo en mayúsculas: " + mayusculas);
        System.out.println("Saludo en minúsculas: " + minusculas);
        System.out.println("Poema en varias líneas:\n" + poema);
    }
}
