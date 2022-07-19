package Ejercicio001;

public class Saludo {

    public static void main(String[] args) {

        //variables locales
        String nombre = "Jorge";

        //podemos recibir parametros externos
        if(args.length > 0) nombre = args[0];

        //imprimimos el nombre
        System.out.println("Hola, mi nombre es " + nombre);
    }
}
