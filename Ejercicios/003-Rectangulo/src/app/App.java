package app;

/* Escribir un programa que calcule el área y el perímetro de un rectángulo y la muestre por consola.
La altura y la anchura del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos la base del rectangulo
        double base = leerValor("base: ");

        //pedimos la base del rectangulo
        double altura = leerValor("altura: ");

        //calculamos el area
        double area = calcularArea(base, altura);

        //calculamos el perímetro
        double perimetro = calcularPerimetro(base, altura);

        //imprimir resultado
        imprimirResultado(base, altura, area, perimetro);

        //cerramos la entrada de datos
        stdin.close();
    }

    private static double leerValor(String texto) {
        double valor;

        do{
            System.out.print(texto);

            try{
                valor = stdin.nextDouble();
                if(valor<=0){
                    throw new IllegalArgumentException("Debe introducir un valor mayor que 0.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                System.out.println("El valor introducido no es correcto");
                valor = 0.0;
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                valor = 0.0;
            }
        } while (valor==0.0);

        return valor;
    }

    private static double calcularArea(double base, double altura) {
        return base * altura;
    }

    private static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    private static void imprimirResultado(double base, double altura, double area, double perimetro) {
        System.out.println("\n*********************************");
        System.out.println("         RESULTADO FINAL");
        System.out.println("*********************************");
        System.out.printf("Base: %.2f%n", base);
        System.out.printf("Altura : %.2f%n", altura);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro : %.2f%n", perimetro);
    }
}
