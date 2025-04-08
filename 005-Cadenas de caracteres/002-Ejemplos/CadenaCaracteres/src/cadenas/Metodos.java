package cadenas;

public class Metodos {

    public static void main(String[] args) {

        String cadena = "En un lugar de la Mancha...";
        String cadena2 = "En un lugar de La Mancha...";
        String cadena3 = "  En un lugar de La Mancha...  ";

        //Tamaño cadena
        System.out.println("Tamaño cadena: " + cadena.length());

        //Char at
        System.out.println("Caracter en 6 = " + cadena.charAt(6));

        //substring
        System.out.println("substring: " + cadena.substring(15,20));
        System.out.println("substring: " + cadena.substring(16));

        //upper and lower case
        System.out.println("Uppercase: " + cadena.toUpperCase());
        System.out.println("Lowercase: " + cadena.toLowerCase());

        //equals
        System.out.println("equals: " + cadena.equals(cadena2));
        System.out.println("equals ignore case: " + cadena.equalsIgnoreCase(cadena2));

        //start with
        System.out.println("start with: " + cadena.startsWith("En"));
        System.out.println("end with: " + cadena.endsWith("..."));

        //contains
        System.out.println("contains: " + cadena.contains("Mancha"));

        //index of
        System.out.println("index of: " + cadena.indexOf("a"));
        System.out.println("index of: " + cadena.lastIndexOf("a"));

        //replace
        System.out.println("replace : " + cadena.replace("a", "A"));
        System.out.println("replace : " + cadena.replaceFirst("a","A"));
        
        //join
        String lang = String.join(", ", "Java","Python","C++");
        System.out.println("lang = " + lang);

        //trim
        System.out.println("trim : " + cadena3.trim());

        //stripIndent
        String multilinea = "\tqwerty\n\tasdfg       \n\tzxcv    ";
        System.out.println(multilinea.stripIndent());

        //formatted
        System.out.println("El precio del producto es %.2f".formatted(12.340));

        //repeat
        System.out.println("*".repeat(5));

        //isBlank
        System.out.println(" ".isBlank());

        //isEmpty
        System.out.println(" ".isEmpty());
        
    }
}
