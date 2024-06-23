package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un algoritmo llamado producto que lea dos números (n1 y n2) enteros positivos
 * y calcule y muestre su multiplicación sin usar el operador de multiplicar (*).
 * Pista: n1 x n2 es sumar n2 veces el número n1.
 * @author jorge
 */
public class Producto {
    private static final Scanner stdin = new Scanner(System.in);
    private static final String N1 = "n1";
    private static final String N2 = "n2";

    public static void main(String[] args) {
        int n1=getValor(N1);
        int n2=getValor(N2);
        System.out.println(getProducto(n1,n2));
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

        while (!valorEsValido) {
            System.out.print(numero + ":");
            try {
                valorEsValido = true;
                valor = stdin.nextInt();
                if (valor <= 0) {
                    throw new IllegalArgumentException("Valor no valido. Introduzca un valor entero positivo.");
                }
            } catch (InputMismatchException ex) {
                stdin.next();
                valorEsValido = false;
                System.out.println("Valor no valido. Introduzca un valor entero positivo.");
            } catch (IllegalArgumentException ex) {
                valorEsValido = false;
                System.out.println(ex.getMessage());
            }
        }
        return valor;
    }

    /**
     * Metodo que calcula el resultado del producto y construye la cadena con la estructura del producto
     * @param n1: número 1
     * @param n2: número 2
     * @return la cadena con la estructura del producto
     */
    private static StringBuilder getProducto(int n1, int n2){
        StringBuilder sb = new StringBuilder();
        int resultado = 0;
        for(int i=1;i<=n2;i++){
            resultado += n1;
            if(i < n2){
                sb.append(n1).append(" + ");
            } else {
                sb.append(n1).append(" = ").append(resultado);
            }
        }
        return sb;
    }
}
