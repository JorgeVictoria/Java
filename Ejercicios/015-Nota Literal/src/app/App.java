package app;

/* Escribe un programa en Java que muestre la nota literal de un estudiante en función de su nota numérica usando switch
   como expresión, no como sentencia.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos el valor de la nota
        double notaNumerica = leerNotaNumerica();

        //cerramos la entrada de datos
        stdin.close();

        //calculamos la nota literal
        String notaLiteral = obtenerNotaLiteral(notaNumerica);

        //mostramos el resultado
        mostrarResultado(notaLiteral,notaNumerica);
    }

    private static double leerNotaNumerica() {
        double nota;
        do{
            System.out.print("Nota: ");
            try{
                nota=stdin.nextDouble();
                if(nota<0 || nota>10){
                    throw new IllegalArgumentException("El valor introducido no es correcto. " +
                            "Introduzca un valor entre 0 y 10.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                System.out.println("El valor introducido no es correcto. Introduzca un valor numérico entre 0 y 10.");
                nota=-1;
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                nota=-1;
            }
        } while (nota==-1);
        return nota;
    }

    private static String obtenerNotaLiteral(double notaNumerica) {
        return switch ((int) notaNumerica){
            case 0,1,2,3,4 -> "Suspendido";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7,8 -> "Notable";
            case 9,10 -> "Sobresaliente";
            default -> "Nota incorrecta";
        };
    }

    private static void mostrarResultado(String notaLiteral, double notaNumerica) {
        System.out.println("**************************");
        System.out.println("RESULTADO FINAL");
        System.out.println("**************************");
        System.out.printf("Nota Numérica:\t%.2f%n", notaNumerica);
        System.out.printf("Nota Literal:\t%s", notaLiteral);
    }
}
