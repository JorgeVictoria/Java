import java.util.Arrays;

public class Metodos {

    public static void main(String[] args) {
        
        String nombre = "Jorge";
        String trababalenguas = "trabalenguas";

        //longitud
        System.out.println("nombre.length() = " + nombre.length());
        
        //mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        
        //minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        
        //comparar cadenas
        System.out.println("nombre.equals(\"Jorge\") = " + nombre.equals("Jorge"));
        System.out.println("nombre.equals(\"jorge\") = " + nombre.equals("jorge"));
        System.out.println("nombre.equalsIgnoreCase(\"jorge\") = " + nombre.equalsIgnoreCase("jorge"));

        //comparacion lexicografico
        System.out.println("nombre.compareTo(\"Jorge\") = " + nombre.compareTo("Jorge"));
        System.out.println("nombre.compareTo(\"jorge\") = " + nombre.compareTo("jorge"));
        
        //buscar un caracter
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));

        //buscar ultimo caracter
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        
        //subcadenas
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        
        //reemplazar caracteres
        System.out.println("trababalenguas.replace(\"a\", \"@\") = " + trababalenguas.replace("a", "@"));

        //mirar el indice de un caracter, si existe. Devuelve la primera posicion
        System.out.println("trababalenguas.indexOf(\"a\") = " + trababalenguas.indexOf("a"));
        System.out.println("trababalenguas.indexOf(\"a\") = " + trababalenguas.indexOf("o"));
        
        //mirar el ultimo indice de un caracter, si existe
        System.out.println("trababalenguas.lastIndexOf(\"a\") = " + trababalenguas.lastIndexOf("a"));
        
        //mirar si contiene un caracter
        System.out.println("trababalenguas.contains(\"a\") = " + trababalenguas.contains("a"));
        System.out.println("trababalenguas.contains(\"len\") = " + trababalenguas.contains("len"));
        System.out.println("trababalenguas.contains(\"o\") = " + trababalenguas.contains("o"));

        //mirar si comienza con un caracter
        System.out.println("trababalenguas.startsWith(\"traba\") = " + trababalenguas.startsWith("traba"));
        System.out.println("trababalenguas.startsWith(\"raba\") = " + trababalenguas.startsWith("raba"));

        //mirar si termina con un caracter
        System.out.println("trababalenguas.startsWith(\"traba\") = " + trababalenguas.endsWith("traba"));
        System.out.println("trababalenguas.startsWith(\"raba\") = " + trababalenguas.endsWith("as"));
        
        //quitar espacios en blanco
        trababalenguas = "  trabalenguas  ";
        System.out.println("trababalenguas = " + trababalenguas);
        System.out.println("trababalenguas.trim() = " + trababalenguas.trim());


    }
}
