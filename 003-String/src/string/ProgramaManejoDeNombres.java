package string;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //solicitamos los 3 nombres
        String[] nombres = new String[3];
        for(int i = 0; i < nombres.length; i++){
            nombres[i] = escribirNombre();
        }
        
        //creamos la cadena
        String cadena = obtenerCadena(nombres);
        System.out.println("cadena = " + cadena);
        
    }

    //método para pedir el nombre
    //comprobamos que la cadena tenga al menos 2 caracteres
    private static String escribirNombre(){
        String nombre = null;
        boolean esCorrecto = false;
        while (!esCorrecto){
            System.out.print("Nombre:");
            nombre = scanner.nextLine();
            if(nombre == null || nombre.isBlank() || nombre.length() < 2){
                System.out.println("Introduzca un nombre.");
            }
            else{
                esCorrecto = true;
            }
        }
        return nombre;
    }

    //Método para obtener la cadena final
    private static String obtenerCadena(String[] nombres){
        String cadena = "";
        for(int i=0; i< nombres.length;i++){
            cadena = cadena.
                    concat(String.valueOf(nombres[i].charAt(1)).toUpperCase()).
                    concat(".").
                    concat(nombres[i].substring(nombres[i].length()-2));
            if(i!= nombres.length-1){
                cadena = cadena.concat("_");
            }
        }
        return cadena;
    }
}
