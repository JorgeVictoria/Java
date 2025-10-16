package app;

// Escribe un programa en Java que intercambie el valor de dos variables.

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);
    private static int numA;
    private static int numB;

    public static void main(String[] args) {
        //leemos dos valores enteros
        numA = leerValor("numA : ");
        numB = leerValor("numB : ");
        
        //cambiamos los valores
        cambiarValores();
        
        //imprimimos el resultado por pantalla
        System.out.println("----------------");
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);

        //cerramos la entrada de datos
        stdin.close();
    }

    private static int leerValor(String texto) {
        int valor;

        do{
            System.out.print(texto);

            try{
                valor = stdin.nextInt();
                if(valor<=0){
                    throw new IllegalArgumentException("Debe introducir un valor entero positivo.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                System.out.println("El valor introducido no es correcto");
                valor = 0;
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                valor = 0;
            }
        } while (valor==0);

        return valor;
    }

    private static void cambiarValores() {
        int aux = numA;
        numA = numB;
        numB = aux;
    }

}
