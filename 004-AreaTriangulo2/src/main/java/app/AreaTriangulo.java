package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Convierte el código del ejercicio E3 en un sub algoritmo de tipo función de nombre producto.
 * Luego crea un algoritmo que lea la base y la altura de un triángulo
 * y calcule y muestre su área usando la función producto: área = base * altura / 2
 * @author Jorge Victoria Andreu (24-JUNIO-2024)
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
        int base = getLadoTriangulo(BASE);
        int altura = getLadoTriangulo(ALTURA);
        int area = getArea(base, altura);
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
    private static int getLadoTriangulo(String lado) {
        int valor = 0;
        boolean valorEsValido = false;

        while(!valorEsValido){
            System.out.print(lado + ":");
            try {
                valorEsValido=true;
                valor=stdin.nextInt();
                if(valor<=0){
                    throw new IllegalArgumentException("Valor no valido. Introduzca un valor entero positivo.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                valorEsValido=false;
                System.out.println("Valor no valido. Introduzca un valor entero positivo");
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
    private static int getArea(int base, int altura) {
        return getProducto(base,altura) / 2;
    }

    /**
     * Método para obtener el producto de dos números
     * @param n1 : número 1
     * @param n2 : número 2
     * @return el producto de los dos números
     */
    private static int getProducto(int n1, int n2){
        int producto = 0;
        for(int i = 1; i <= n2; i++){
            producto += n1;
        }
        return producto;
    }

    /**
     * Método para imprimir todos los valores del triángulo, incluyendo el área.
     * @param base: La base del triángulo.
     * @param altura: La altura del triángulo.
     * @param area: El area del triángulo
     */
    private static void imprimirAreaTriangulo(int base, int altura, int area) {
        System.out.printf("""
                TRIANGULO
                BASE: %d
                ALTURA: %d
                AREA: %d
                %n""", base,altura,area);
    }
}

