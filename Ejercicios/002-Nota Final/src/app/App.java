package app;

/*Realiza un programa en Java que calcule la nota media de un alumno en la asignatura de Programación.
La nota media se calcula como el promedio de las 3 notas trimestrales.
Muestra la nota promedio redondeada y además, muestra un mensaje que indique si
 el alumno está APROBADO (nota final >= 5) o suspenso (nota final < 5).
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);
    private static final String[] trimestres = {"Primer Trimestre", "Segundo Trimestre", "Tercer Trimestre"};

    public static void main(String[] args) {
        //pedimos las notas de cada trimestre
        double[] notasTrimestrales = new double[trimestres.length];
        for(int i = 0; i < trimestres.length; i++){
            notasTrimestrales[i] = leerNota(trimestres[i]);
        }

        //cerramos la entrada de datos
        stdin.close();

        //calculamos la nota media
        int notaMedia = calcularNotaMedia(notasTrimestrales);

        //obtenemos la nota final
        String notaFinal = obtenerNotaFinal(notaMedia);

        //imprimimos el resultado
        imprimirResultado(notasTrimestrales, notaFinal, notaMedia);
    }

    private static double leerNota(String trimestre) {
        double nota;
        do{
            System.out.print(trimestre + ": ");
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

    private static int calcularNotaMedia(double[] notasTrimestrales) {
        double sumaTotalNotas=0;
        for(double notaTrimestral : notasTrimestrales){
            sumaTotalNotas += notaTrimestral;
        }

        return (int) Math.round(sumaTotalNotas / trimestres.length);
    }

    private static String obtenerNotaFinal(double notaMedia) {
        return notaMedia < 5 ? "SUSPENSO" : "APROBADO";
    }

    private static void imprimirResultado(double[] notasTrimestrales, String notaFinal, int notaMedia) {
        System.out.println("**************************");
        System.out.println("RESULTADO FINAL");
        System.out.println("**************************");
        for(int i = 0; i < trimestres.length; i++){
            System.out.printf("%s:\t%.2f%n",trimestres[i], notasTrimestrales[i]);
        }
        System.out.printf("Nota Media:\t\t\t%d%n", notaMedia);
        System.out.printf("Nota Final:\t\t\t%s", notaFinal);
    }
}
