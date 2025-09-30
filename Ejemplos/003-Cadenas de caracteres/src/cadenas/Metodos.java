package cadenas;

public class Metodos {
    public static void main(String[] args) {
        String texto = "  Hola Mundo en Java  ";

        // ---- Métodos básicos ----
        System.out.println("Texto original: [" + texto + "]");
        // número de caracteres
        System.out.println("Longitud: " + texto.length());
        // ¿está vacío?
        System.out.println("Está vacío: " + texto.isEmpty());
        // elimina espacios al inicio y fin
        System.out.println("Trim: [" + texto.trim() + "]");

        // ---- Transformaciones ----
        // texto en mayúsculas
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        //  en minúsculas
        System.out.println("Minúsculas: " + texto.toLowerCase());
        System.out.println("Reemplazar 'Java' por 'Python': " + texto.replace("Java", "Python"));
        // extraer "  Ho"
        System.out.println("Subcadena (0, 4): " + texto.substring(0, 4));

        // ---- Búsquedas ----
        System.out.println("¿Contiene 'Mundo'? " + texto.contains("Mundo"));
        System.out.println("¿Empieza con 'Hola'? " + texto.trim().startsWith("Hola"));
        System.out.println("¿Termina con 'Java'? " + texto.trim().endsWith("Java"));
        System.out.println("Índice de 'Mundo': " + texto.indexOf("Mundo"));
        System.out.println("Última posición de 'a': " + texto.lastIndexOf("a"));

        // ---- Comparaciones ----
        String otra = "hola mundo en java";
        System.out.println("¿Igual a otra (sensible a mayúsculas)? " + texto.equals(otra));
        System.out.println("¿Igual a otra (ignorando mayúsculas)? " + texto.equalsIgnoreCase(otra));
        System.out.println("Comparación lexicográfica: " + texto.compareTo(otra));

        // ---- Acceso a caracteres ----
        System.out.println("Carácter en posición 2: " + texto.charAt(2));
        char[] arrayCaracteres = texto.toCharArray();
        System.out.println("Convertido en array de chars: ");
        for (char c : arrayCaracteres) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ---- División y unión ----
        String frase = "manzana,pera,uva,melon";
        // divide en partes
        String[] frutas = frase.split(",");
        System.out.println("Frutas separadas:");
        for (String fruta : frutas) {
            System.out.println(" - " + fruta);
        }

        // une con separador
        String unido = String.join(" | ", frutas);
        System.out.println("Frutas unidas: " + unido);

        // ---- String.valueOf (conversiones) ----
        int numero = 123;
        double pi = 3.14159;
        boolean bandera = true;
        System.out.println("Número como String: " + String.valueOf(numero));
        System.out.println("Pi como String: " + String.valueOf(pi));
        System.out.println("Booleano como String: " + String.valueOf(bandera));

        // ---- Métodos más modernos (Java 11+) ----
        // repite la cadena 4 veces
        String repetido = "na".repeat(4);
        System.out.println("Repetir 'na' 4 veces: " + repetido + " Batman!");
        // true si solo tiene espacios
        System.out.println("¿Está en blanco? '   ': " + "   ".isBlank());
        System.out.println("Líneas de un texto:");
        String multilinea = "Linea1\nLinea2\nLinea3";
        // separa por líneas
        multilinea.lines().forEach(System.out::println);
    }
}
