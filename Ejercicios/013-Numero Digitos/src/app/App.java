package app;

// Escribe un programa en Java que acepte por teclado un número entero y nos diga la cantidad de dígitos que tiene.

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos un número entero
        int num = leerValor();

        //calculamos el número total de dígitos
        int totalDigitos = obtenerTotalDigitos(num);

        //imprimimos el resultado
        if(totalDigitos==1){
            System.out.printf("El número %d tiene %d dígito.",num,totalDigitos);
        } else {
            System.out.printf("El número %d tiene %d dígitos.",num,totalDigitos);
        }

        //cerramos la entrada de datos
        stdin.close();
    }

    private static int leerValor() {
        int valor;
        do{
            System.out.print("Número:");
            try{
                valor = stdin.nextInt();
                if(valor < 0){
                    throw new IllegalArgumentException("Debe introducir un valor entero positivo.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                System.out.println("El valor introducido no es correcto");
                valor = -1;
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                valor = -1;
            }
        } while (valor==-1);
        return valor;
    }

    private static int obtenerTotalDigitos(int num) {
        int numReferencia = 10;
        int totalDigitos = 1;

        while(num>=numReferencia){
            numReferencia *= 10;
            totalDigitos++;
        }

        return totalDigitos;
    }
}
