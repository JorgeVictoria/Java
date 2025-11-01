package app;

// Calcula cuál es el resultado de sumar los n primeros números positivos. Introduce el valor de n a través del teclado.

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos el número entero positivo
        int num = leerValor();

        //calculamos la suma de n(num) primeros enteros positivos
        int sumaTotal = obtenerSumaTotal(num);

        //mostramos el resultado
        System.out.printf("La suma total de los primeros %d numeros enteros positivos es %d.%n",num,sumaTotal);

        //cerramos la entrada de datos
        stdin.close();
    }

    private static int leerValor() {
        int valor;
        do{
            System.out.print("Número:");
            try{
                valor = stdin.nextInt();
                if(valor <= 0){
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

    private static int obtenerSumaTotal(int num) {
        int sumaTotal=0;
        for(int i=1; i<=num; i++){
            sumaTotal += i;
        }
        return sumaTotal;
    }


}
