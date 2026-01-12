package app;

/*Escribe un programa que lea dos números enteros por teclado, y realice las operaciones básicas de una calculadora
 con ellos: suma, resta, multiplicación, división y resto. Debe mostrar todos los resultados por consola.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos los números
        int numA = leerValor("numA : ");
        int numB = leerValor("numB : ");

        //realizamos las operaciones
        System.out.printf("%d + %d = %d%n", numA, numB, numA+numB);
        System.out.printf("%d - %d = %d%n", numA, numB, numA-numB);
        System.out.printf("%d * %d = %d%n", numA, numB, numA*numB);
        System.out.printf("%d : %d = %d%n", numA, numB, numA/numB);
        System.out.printf("Resto división : %d", numA%numB);

        //cerramos la entrada de datos
        stdin.close();
    }

    private static int leerValor(String texto) {
        int valor = 0;
        boolean valorValido;
        do{
            valorValido = true;
            System.out.print(texto);
            try{
                valor = stdin.nextInt();
            } catch (InputMismatchException ex) {
                stdin.next();
                System.out.println("El valor introducido no es correcto");
                valorValido = false;
            }
        } while (!valorValido);
        return valor;
    }
}
