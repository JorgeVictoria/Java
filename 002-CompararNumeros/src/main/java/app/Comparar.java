package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un algoritmo llamado comparar que lea dos números enteros positivos n1 y n2.
 * Si el primero es mayor (n1 > n2) escribir 1.
 * Si el segundo es mayor (n2 > n1) escribir 2.
 * Si son iguales escribir 0.
 * @author Jorge Victoria Andreu
 */
public class Comparar {

    private static final Scanner stdin = new Scanner(System.in);

    private static final String N1= "n1";
    private static final String N2= "n2";

    public static void main(String[] args) {
        int n1 = getValor(N1);
        int n2 = getValor(N2);
        System.out.println("Resultado: " + compararValores(n1,n2));
        stdin.close();
    }

    /**
     * Este método sirve para chequear si el valor introducido por teclado es válido.
     * En caso correcto, se devuelve el valor introducido.
     * En caso incorrecto, saldrán avisos por pantalla con los errores.
     * @param numero: Un String con el número que queremos conocer.
     * @return El valor del número solicitado.
     */
    private static int getValor(String numero) {
        int valor = 0;
        boolean valorEsValido = false;

        while(!valorEsValido){
            System.out.print(numero + ":");
            try {
                valorEsValido=true;
                valor=stdin.nextInt();
                if(valor<0){
                    throw new IllegalArgumentException("Valor no valido. Introduzca un valor entero positivo.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                valorEsValido=false;
                System.out.println("Valor no valido. Introduzca un valor entero positivo.");
            } catch (IllegalArgumentException ex){
                valorEsValido=false;
                System.out.println(ex.getMessage());
            }
        }
        return valor;

    }

    /**
     * Método para comparar dos valores y devolver el resutado de la comparación
     * @param n1: número 1
     * @param n2: número 2
     * @return el resultado de la comparación
     */
    private static int compararValores(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 < n2) return 2;
        else return 0;
    }

}
