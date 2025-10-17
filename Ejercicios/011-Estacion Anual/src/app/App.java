package app;

/*Implementa un programa en Java que dada una fecha, nos indique cuál es la estación del año
(en el hemisferio que tú quieras, aunque la solución se dará del hemisferio norte).
El día del mes, y el mes del año se deben introducir como números enteros a través del teclado.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);
    private static final String[] NOMBRES_MESES = {"enero","febrero","marzo","abril", "mayo","junio","julio","agosto",
            "septiembre","octubre","noviembre","diciembre"};

    public static void main(String[] args) {
        //Primero debemos de leer el mes. Debe ser un valor entre 1 y 12
        int numeroDeMes = leerDato("Numero de mes", 12);

        //Debemos saber cuantos dias tiene el mes y el nombre del mes
        int diasDelMes = obtenerDiasDelMes(numeroDeMes);

        //Pedimos el dia
        int numeroDia = leerDato("Dia del mes", diasDelMes);

        //Obtenemos la estación
        String estacionAnual = obtenerEstacionAnual(numeroDia, numeroDeMes);

        //Mostrar el resultado
        System.out.printf("El %s de %s es %s.",numeroDia,NOMBRES_MESES[numeroDeMes-1],estacionAnual);

        //cerramos la entrada de datos
        stdin.close();
    }

    private static int leerDato(String texto, int valorMaximo) {
        int valor;
        do{
            System.out.print(texto + " [1-" + valorMaximo + "]: ");
            try{
                valor = stdin.nextInt();
                if(valor< 1 || valor>valorMaximo){
                    throw new IllegalArgumentException("Debe introducir un valor entre 1 y " + valorMaximo);
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

    private static int obtenerDiasDelMes(int numeroDeMes) {
        return switch (numeroDeMes) {
            case 1,3,5,7,8,10,12->31;
            case 4,6,9,11->30;
            case 2->28;
            default -> throw new IllegalStateException("Unexpected value: " + numeroDeMes);
        };
    }

    private static String obtenerEstacionAnual(int numeroDia, int numeroDeMes) {
        if((numeroDeMes==3 && numeroDia >=21) || (numeroDeMes==4) || (numeroDeMes==5) ||
                (numeroDeMes==6 && numeroDia<=20)){
            return "primavera";
        } else if (numeroDeMes == 6 || numeroDeMes == 7 || numeroDeMes == 8 || (numeroDeMes == 9 && numeroDia <= 22)){
            return "verano";
        } else if (numeroDeMes==9 || numeroDeMes == 10 || numeroDeMes == 11 || (numeroDeMes<=12 && numeroDia<=20)){
            return "otoño";
        } else {
            return "invierno";
        }
    }
}
