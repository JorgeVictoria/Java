package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola.
 * El `radio` del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.
 */

public class Circulo {

    private static final Scanner stdin = new Scanner(System.in);
    private static final String RADIO = "Radio";
    private static final String PERIMETRO = "Perimetro";
    private static final String AREA = "Area";
    private static final String VALOR_INCORRECTO = "El valor introducido no es correcto.";

    public static void main(String[] args) {

        //Leer radio del círculo
        double radio = leerDatos();

        //Calcular el perÍmetro del círculo
        double perimetro = calcularPerimetro(radio);

        //Calcular el area del círculo
        double area = calcularArea(radio);
        
        //Imprimir el resultado
        imprimirResultado(radio, perimetro, area);
        
        //Cerramos la entrada de datos
        stdin.close();

    }

    private static double leerDatos() {
        //variables locales
        double valor = 0.0;
        boolean esValorValido = false;

        while(!esValorValido){
            System.out.print(Circulo.RADIO + ":");
            try{
                valor = stdin.nextDouble();
                esValorValido = true;
                if(valor <= 0){
                    throw new IllegalArgumentException(VALOR_INCORRECTO);
                }
            } catch (InputMismatchException ex){
                stdin.next();
                esValorValido = false;
                System.out.println(VALOR_INCORRECTO);
            } catch (IllegalArgumentException ex){
                esValorValido = false;
                System.out.println(ex.getMessage());
            }
        }
        return valor;
    }

    private static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    private static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio,2);
    }

    private static void imprimirResultado(double radio, double perimetro, double area) {
        System.out.println();
        System.out.printf("""
                **************************
                        RESULTADO
                **************************
                %s: \t\t%.2f
                %s: \t%.2f
                %s: \t\t%.2f
                %n""", RADIO,radio,PERIMETRO,perimetro,AREA,area);
    }
}
