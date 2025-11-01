package app;

//Escribe un programa en Java que acepte por teclado un número entero entre 1 y 10 y muestre su tabla de multiplicar.

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos el número entero
        int num = leerNumero();

        //cerramos la entrada de datos
        stdin.close();

        //mostramos la tabla de multiplicar
        mostrarTablaMultiplicar(num);
    }

    private static int leerNumero() {
        int valor;
        do{
            System.out.print("num: ");
            try{
                valor = stdin.nextInt();
                if(valor<=0 || valor>10){
                    throw new IllegalArgumentException("Debe introducir un valor entero entre 1 y 10.");
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

    private static void mostrarTablaMultiplicar(int num) {
        System.out.println("**************************");
        System.out.printf("TABLA DE MULTIPLICAR DEL %d%n",num);
        System.out.println("**************************");
        for(int i=0; i<=10; i++){
            System.out.printf("%d x %d = %d%n",num,i,num*i);
        }
    }
}
