package Ejercicio003;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

    private static Scanner stdin = new Scanner((System.in));
    private static StringBuilder cadena = new StringBuilder();

    public static void main(String[] args) {

        //variables locales
        String persona1 = cogerNombre("primer Nombre");
        String persona2 = cogerNombre("segundo Nombre");
        String persona3 = cogerNombre("tercer Nombre");

        //creamos la cadena
        crearCadena(persona1);
        crearCadena(persona2);
        crearCadena(persona3);

        //imprimimos la cadena
        System.out.println("cadena = " + cadena.substring(0, cadena.length()-1));
    }

    private static String cogerNombre(String unNombre) {

        //variables locales
        boolean nombreCorrecto = false;
        String nombre = "";

        //mientras el nombre no sea correcto, lo vamos pidiendo
        while(!nombreCorrecto){
            System.out.printf("Introduzca el " + unNombre + ":");
            nombre = stdin.nextLine();

            //comprobamos que la longitud sea al menos de 3 palabras
            if(nombre.length() >= 3) nombreCorrecto = true;
            else System.out.println("La longitud del nombre debe ser de al menos 3 letras.");

            //comprobamos que no tenga digitos o espacios
            if(nombreCorrecto){
                char[] letras = nombre.toCharArray();
                for(int i = 0; i < letras.length;i++){
                    if(Character.isAlphabetic(letras[i]) == false && letras[i] != ' ') {
                        nombreCorrecto = false;
                        System.out.println("El nombre solo puede contener letras o espacios");
                        break;
                    };
                }
            }

        }
        
        return nombre;
    }

    private static void crearCadena(String persona){
        cadena.append(persona.toUpperCase().charAt(1));
        cadena.append(".");
        cadena.append(persona.substring(persona.length() - 2));
        cadena.append("_");
    }
}
