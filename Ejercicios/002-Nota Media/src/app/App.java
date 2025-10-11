package app;

/*Realiza un programa en Java que calcule la nota media de un alumno en la asignatura de Programación.
  La nota media se calcula como el promedio de las 3 notas trimestrales.
  Muestra la nota promedio redondeada y además,
  muestra un mensaje que indique si el alumno está APROBADO (nota final >= 5) o suspenso (nota final < 5).
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);
    private static final String[] TRIMESTRES = {"Primer Trimestre: ", "Segundo Trimestre: ", "Tercer Trimestre: "};

    public static void main(String[] args) {

        double[] notas = new double[TRIMESTRES.length];

        //pedimos las notas
        for(int i = 0; i < notas.length; i++){
            notas[i] = leerNota(TRIMESTRES[i]);
        }

        //calculamos la nota media redondeada
        int notaMedia = calcularNotaMedia(notas);

        //obtener la nota final
        String notaFinal = obtenerNotaFinal(notaMedia);

        //imprimimos el resultado
        imprimirResultado(notas, notaMedia, notaFinal);

        //cerramos la entrada de datos
        stdin.close();
    }

    private static double leerNota(String trimestre) {

        double nota;

        do{
            System.out.print(trimestre);
            try{
                nota = stdin.nextDouble();
                if(nota < 0 || nota > 10){
                    throw new IllegalArgumentException("Debe introducir un valor entre 0 y 10.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                System.out.println("El valor introducido no es correcto");
                nota = -1;
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                nota = -1;
            }
        } while (nota<0);

        return nota;
    }

    private static int calcularNotaMedia(double[] notas) {
        double sumaNotas = 0;

        for(double nota : notas){
            sumaNotas += nota;
        }

        return (int) Math.round(sumaNotas/3);
    }

    private static String obtenerNotaFinal(int notaMedia) {
        return notaMedia >= 5 ? "APROBADO" : "SUSPENSO";
    }

    private static void imprimirResultado(double[] notas, int notaMedia, String notaFinal) {
        System.out.println("\n*********************************");
        System.out.println("         RESULTADO FINAL");
        System.out.println("*********************************");

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%-20s: %.2f%n", TRIMESTRES[i], notas[i]);
        }

        System.out.println("---------------------------------");
        System.out.printf("Nota Media: %d%n", notaMedia);
        System.out.printf("Resultado : %s%n", notaFinal);
    }
}

