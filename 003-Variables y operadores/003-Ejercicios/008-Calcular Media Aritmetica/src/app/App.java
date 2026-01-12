package app;

/*Escribe un programa en Java que calcule la media de 3 números que se hayan leído desde el teclado
  y la muestre por consola.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    private static final Scanner stdin = new Scanner(System.in);
    private static final String[] textoNums = {"numA: ", "numB: ", "numC: "};
    private static final int[] nums = new int[3];

    public static void main(String[] args) {
        //pedimos los valores de cada número
        for(int i = 0; i < nums.length; i++){
            nums[i] = leerValor(textoNums[i]);
        }
        
        //calculamos la media e imprimimos el valor
        double media = calcularMedia();
        
        //imprimimos el resultado
        imprimirResultado(media);
        
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

    private static double calcularMedia() {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        return (double) total/nums.length;
    }

    private static void imprimirResultado(double media) {
        System.out.println("\n*********************************");
        System.out.println("         RESULTADO FINAL");
        System.out.println("*********************************");

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%s %d%n", textoNums[i], nums[i]);
        }

        System.out.println("---------------------------------");
        System.out.printf("Media: %.2f%n", media);
    }

}
