package app;

/*
 * Realiza un programa en Java que calcule la nota media de un alumno en la asignatura de Programación.
 * La nota media se calcula como el promedio de las 3 notas trimestrales.
 * Muestra la nota promedio redondeada y además, muestra un mensaje que indique si el alumno está
 *  APROBADO (nota final >= 5) o suspenso (nota final < 5).
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrecioFinal {

    private static final Scanner stdin = new Scanner(System.in);
    private static final String[] trimestres = {"Primer Trimestre", "Segundo Trimestre", "Tercer Trimestre"};
    private static final String APROBADO = "APROBADO";
    private static final String SUSPENSO = "SUSPENSO";
    private static final int NOTA_MINIMA_APROBADO = 5;

    public static void main(String[] args) {
        Double[] notas = new Double[3];
        
        //pedimos las notas
        for(int i = 0; i < trimestres.length; i++){
            notas[i] = pedirNotaTrimestre(trimestres[i]);
        }

        //calculamos la nota final
        int notaFinal = calcularNotaFinal(notas);

        //calculamos calificación
        String calificacion = calcularCalificacion(notaFinal);

        //imprimimos el resultado
        imprimirResultado(notas, notaFinal, calificacion);

        //cerramos la entrada de datos
        stdin.close();
    }

    private static Double pedirNotaTrimestre(String trimestre) {
        //variables locales
        double nota = 0.0;
        boolean esValorValido = false;

        while(!esValorValido){
            System.out.print(trimestre + ":");
            try{
                nota = stdin.nextDouble();
                esValorValido = true;
                if(nota < 0 || nota > 10){
                    throw new IllegalArgumentException("El valor de la nota debe ser entre 0 y 10.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                esValorValido = false;
                System.out.println("El valor introducido no es valido.");
            } catch (IllegalArgumentException ex){
                esValorValido = false;
                System.out.println(ex.getMessage());
            }
        }
        return nota;
    }

    private static int calcularNotaFinal(Double[] notas) {
        double notaFinal = 0.0;
        for (Double nota : notas) {
            notaFinal += nota;
        }

        return (int)Math.round(notaFinal/3);
    }

    private static String calcularCalificacion(double notaFinal) {
        return notaFinal >= NOTA_MINIMA_APROBADO ? APROBADO : SUSPENSO;
    }

    private static void imprimirResultado(Double[] notas, int notaFinal, String calificacion) {
        System.out.println();

        //Cabecera
        System.out.print("""
        **************************
                RESULTADO
        **************************
        """);

        //Notas de cada trimestre
        for(int i = 0; i < trimestres.length ; i++){
            System.out.printf("%s \t: %.2f%n", trimestres[i], notas[i]);
        }

        //Resto de datos
        System.out.printf("""
        Nota Final \t\t\t: %d
        Calificación \t\t: %s
        %n""",  notaFinal, calificacion);

    }
} 
