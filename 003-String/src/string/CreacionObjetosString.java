package string;

import java.util.Arrays;

public class CreacionObjetosString {

    public static void main(String[] args) {

        //Creación directa
        String cadena1 = "Curso de Java";

        //Creación mediante new
        String cadena2 = new String("Curso de Java");

        //comparamos si son la misma instancia
        boolean mismoObjeto = cadena1==cadena2;
        System.out.println("mismoObjeto = " + mismoObjeto);
        
        //comparamos el contenido
        boolean mismoContenido = cadena1.equals(cadena2);
        System.out.println("mismoContenido = " + mismoContenido);
    }
}
