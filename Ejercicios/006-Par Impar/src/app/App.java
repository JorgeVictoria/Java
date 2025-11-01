package app;

//Escribe un programa que determine si un número es par o impar usando el operador ternario.

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos el número entero
        int num = leerValor();

        //cerramos la entrada de datos
        stdin.close();

        //calcular resultado
        System.out.printf("El número introducido es %s", calcularResultado(num));
    }

    private static int leerValor() {
        int valor;
        do{
            System.out.print("num : ");

            try{
                valor = stdin.nextInt();
                if(valor<=0){
                    throw new IllegalArgumentException("Debe introducir un valor entero mayor que 0.");
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

    private static String calcularResultado(int numA) {
        return numA%2==0 ? "PAR" : "IMPAR";
    }
}
