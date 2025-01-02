package string;

public class Metodos {

    public static void main(String[] args) {

        String nombre = "Jorge";

        //largo de la cadena
        System.out.println(nombre.length());

        //mayúsculas
        System.out.println(nombre.toUpperCase());

        //minúsculas
        System.out.println(nombre.toLowerCase());

        //comparar
        System.out.println(nombre.equals("jorge"));

        //comparar sin tener en cuenta mayúsculas o minúsculas
        System.out.println(nombre.equalsIgnoreCase("jorge"));

        //compara en relación tabla Unicode
        System.out.println(nombre.compareTo("jorge"));

        //compara en relación tabla Unicode sin tener en cuenta mayúsculas o minúsculas
        System.out.println(nombre.compareToIgnoreCase("jorge"));

        //para obtener el caracter de un índice
        System.out.println(nombre.charAt(2));

        //obtener el último caracter
        System.out.println(nombre.charAt(nombre.length()-1));

        //Obtener una parte de la cadena.
        System.out.println(nombre.substring(2));

        //Obtener una parte de la cadena. Se incluye él desde pero no él hasta
        System.out.println(nombre.substring(2,4));

        //Reemplazar un caracter
        System.out.println(nombre.replace("o", "a"));

        //Para saber el índice de un caracter. Devuelve la primera ocurrencia
        System.out.println(nombre.indexOf("o"));

        //Para saber el índice de un caracter. Devuelve la última ocurrencia. Devuelve -1 si no hay coincidencia.
        System.out.println(nombre.lastIndexOf("o"));

        //Para saber si una cadena contiene una secuencia de caracteres
        System.out.println(nombre.contains("or"));

        //Para comprobar si una cadena empieza por una secuencia de caracteres
        System.out.println(nombre.startsWith("Jor"));

        //Para comprobar si una cadena finaliza por una secuencia de caracteres
        System.out.println(nombre.endsWith("Jor"));

        //Para eliminar espacios en blanco, tanto delante como detras
        nombre = "  Jorge  ";
        System.out.println(nombre.trim());
    }
}
