package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Leer un nÚmero llamado "n" y aproximar su raíz cuadrada (sin decimales) probando desde el 0 hasta el
 * número "r" cuyo cuadrado no exceda a n.
 * @author jorge 
 */
public class RaizCuadradaAproximada {

    private static final String N = "n";
    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getValor();
        int r = getRaizCuadradaAproximada(n);
        System.out.println(imprimirResultado(n,r));
        stdin.close();
    }

    /**
     * Este método sirve para chequear si el valor introducido por teclado es válido.
     * En caso correcto, se devuelve el valor introducido.
     * En caso incorrecto, saldrán avisos por pantalla con los errores.
     * @return El valor del número solicitado.
     */
    private static int getValor() {
        int valor = 0;
        boolean valorEsValido = false;

        while (!valorEsValido) {
            System.out.print(N + ":");
            try {
                valorEsValido = true;
                valor = stdin.nextInt();
                if (valor < 0) {
                    throw new IllegalArgumentException("Valor no valido. Introduzca un valor entero.");
                }
            } catch (InputMismatchException ex) {
                stdin.next();
                valorEsValido = false;
                System.out.println("Valor no valido. Introduzca un valor entero.");
            } catch (IllegalArgumentException ex) {
                valorEsValido = false;
                System.out.println(ex.getMessage());
            }
        }
        return valor;
    }

    /**
     * Método para calcular la raiz cuadrada aproximada
     * @param n: número entero
     * @return un entero con la raiz cuadrada aproximada de n
     */
    private static int getRaizCuadradaAproximada(int n){
        int r = 0;
        do{
            if(r * r == n){
                return r;
            } else {
                if (r * r < n) {
                    r++;
                } else {
                    return r-1;
                }
            }
        } while(r<=n);
        return r;
    }

    /**
     * Método para imprimir el resumen de la operación
     * @param n: número del cual queremos obtener su raiz cuadrada aproximada
     * @param r: raiz cuadrada aproximada de "n"
     * @return una cadena con el resumen de la operación
     */
    private static String imprimirResultado(int n, int r){
        return """
                RAIZ CUADRADA APROXIMADA
                n: %d
                r: %d
                """.formatted(n,r);
    }
}
