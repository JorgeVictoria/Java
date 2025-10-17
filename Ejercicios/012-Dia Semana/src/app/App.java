package app;

/*Realiza un programa en Java que, dado un día de la semana como un número entero, nos indique el día como texto.
Haz una version, usando switch como expresión.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //Primero debemos de leer el dia.
        int numeroDia = leerDato();

        //Obtenemos el dia de la semana
        String diaSemana = obtenerDia(numeroDia);

        //Mostrar el resultado
        System.out.printf("El %d es %s.%n",numeroDia,diaSemana);

        //cerramos la entrada de datos
        stdin.close();
    }

    private static int leerDato() {
        int valor;
        do{
            System.out.print("Numero de dia [1-7]:");
            try{
                valor = stdin.nextInt();
                if(valor < 1 || valor > 7){
                    throw new IllegalArgumentException("Debe introducir un valor entre 1 y 7.");
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

    private static String obtenerDia(int numeroDia) {
        return switch (numeroDia) {
            case 1->"lunes";
            case 2->"martes";
            case 3->"miércoles";
            case 4->"jueves";
            case 5->"viernes";
            case 6->"sábado";
            case 7->"domingo";
            default -> throw new IllegalStateException("Unexpected value: " + numeroDia);
        };
    }
}
