package app;

/* Escribe un programa en Java que acepte por teclado dos números enteros y calcule su máximo común divisor usando
   el algoritmo de Euclides. Dicho algoritmo tiene los siguientes pasos:
        a) Se divide el número mayor (a) entre el menor (b).
        b) Si la división es exacta (resto igual a 0), el divisor es el m.c.d.
        c) Si la división no es exacta, dividimos el divisor entre el resto obtenido y continuamos de esta forma hasta
           obtener una división exacta. El m.c.d. es el último divisor.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos los 2 números enteros
        int numA = leerNumero("numA: ");
        int numB = leerNumero("numB: ");

        //cerramos la entrada de datos
        stdin.close();

        //calcular el MCD
        int mcd = calcularMcd(numA,numB);

        //mostrar resultado
        mostrarResultado(numA,numB,mcd);
    }

    private static int leerNumero(String numero) {
        int valor;
        do{
            System.out.print(numero);
            try{
                valor = stdin.nextInt();
                if(valor<=0){
                    throw new IllegalArgumentException("Debe introducir un valor mayor que 0.");
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

    private static int calcularMcd(int numA, int numB) {
        int numMayor = Math.max(numA, numB);
        int numMenor = Math.min(numA, numB);

        while(numMayor%numMenor!=0){
            int aux = numMenor;
            numMenor = numMayor%numMenor;
            numMayor = aux;
        }
        return numMenor;
    }

    private static void mostrarResultado(int numA, int numB, int mcd) {
        System.out.println("**************************");
        System.out.println("RESULTADO FINAL");
        System.out.println("**************************");
        System.out.printf("NumA:\t%d%n", numA);
        System.out.printf("NumB:\t%d%n", numB);
        System.out.printf("MCD:\t%d%n", mcd);
    }
}
