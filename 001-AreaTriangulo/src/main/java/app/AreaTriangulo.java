package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lee la base y la altura de un triángulo y muestra el área: área = base x altura / 2
 * @author Jorge Victoria Andreu (23-JUNIO-2024)
 * @version JDK17
 */
public class AreaTriangulo {

    private static final Scanner stdin = new Scanner(System.in);

    private static final String BASE= "Base";
    private static final String ALTURA= "Altura";


    /**
     * main method
     * @param args: an array with initial arguments
     */
    public static void main(String[] args) {
        double base = getLadoTriangulo(BASE);
        double altura = getLadoTriangulo(ALTURA);
        double area = getArea(base, altura);
        imprimirAreaTriangulo(base, altura, area);
        stdin.close();
    }

    /**
     * Este método sirve para chequear si el valor introducido por teclado es válido.
     * En caso correcto, se devuelve el valor introducido.
     * En caso incorrecto, saldrán avisos por pantalla con los errores.
     * @param lado: Un String con el lado del triángulo cuyo valor queremos conocer.
     * @return El valor del lado del triángulo que hemos solicitado.
     */
    private static double getLadoTriangulo(String lado) {
        double valor = 0.0;
        boolean valorEsValido = false;

        while(!valorEsValido){
            System.out.print(lado + ":");
            try {
                valorEsValido=true;
                valor=stdin.nextDouble();
                if(valor<=0){
                    throw new IllegalArgumentException("Valor no valido. Introduzca un valor positivo.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                valorEsValido=false;
                System.out.println("Valor no valido.");
            } catch (IllegalArgumentException ex){
                valorEsValido=false;
                System.out.println(ex.getMessage());
            }
        }
        return valor;
    }

    /**
     * Método para calcular el área de un triángulo.
     * @param base: La base del triángulo.
     * @param altura: La altura del triángulo.
     * @return el area del triángulo.
     */
    private static double getArea(double base, double altura) {
        return base * altura / 2;
    }

    /**
     * Método para imprimir todos los valores del triángulo, incluyendo el área.
     * @param base: La base del triángulo.
     * @param altura: La altura del triángulo.
     * @param area: El area del triángulo
     */
    private static void imprimirAreaTriangulo(double base, double altura, double area) {
        System.out.printf("""
                TRIANGULO
                BASE: %.2f
                ALTURA: %.2f
                AREA: %.2f
                %n""", base,altura,area);
    }
}

