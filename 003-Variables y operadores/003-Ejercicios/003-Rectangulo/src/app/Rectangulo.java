package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribir un programa que calcule el área y el perímetro de un rectángulo y la muestre por consola.
 * La `altura` y la `anchura` del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.
 */

public class Rectangulo {

    private static final Scanner stdin = new Scanner(System.in);
    private static final String ALTURA = "Altura";
    private static final String BASE = "Base";
    private static final String AREA = "Area";
    private static final String PERIMETRO = "Perimetro";
    private static final String VALOR_INCORRECTO = "El valor introducido no es correcto.";

    public static void main(String[] args) {

        //Solicitar la base del rectangulo
        double base = getValor(BASE);

        //Solicitar la altura del rectangulo
        double altura = getValor(ALTURA);

        //calcular area del triangulo
        double area = calcularAreaTriangulo(base, altura);

        //calcular perímetro del triangulo
        double perimetro = calcularPerimetroTriangulo(base, altura);

        //imprimir resultado
        imprimirResultado(base, altura, area, perimetro);

        //cerramos el scanner
        stdin.close();

    }

    private static double getValor(String textoEntrada) {
        //variables locales
        double valor = 0.0;
        boolean esValorValido = false;

        while(!esValorValido){
            System.out.print(textoEntrada + ":");
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

    private static double calcularAreaTriangulo(double base, double altura) {
        return base * altura;
    }

    private static double calcularPerimetroTriangulo(double base,double altura) {
        return 2 * (base + altura);
    }

    private static void imprimirResultado(double base, double altura, double area, double perimetro) {
        System.out.println();
        System.out.printf("""
                **************************
                        RESULTADO
                **************************
                %s: \t\t%.2f
                %s: \t%.2f
                %s: \t\t%.2f
                %s: \t%.2f
                %n""", BASE,base,ALTURA,altura,AREA,area,PERIMETRO,perimetro);
    }
}
