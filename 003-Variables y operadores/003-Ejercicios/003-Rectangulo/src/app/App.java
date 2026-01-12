package app;

/*Escribir un programa que calcule el área y el perímetro de un rectángulo y la muestre por consola.
  La altura y la anchura del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos los lados del rectángulo
        double base = leerLado("Base: ");
        double altura = leerLado("Altura: ");

        //cerramos la entrada de datos
        stdin.close();

        //calculamos el área del rectángulo
        double area = calcularArea(altura,base);

        //calculamos el perímetro del rectángulo
        double perimetro = calcularPerimetro(altura,base);

        //mostramos el resultado
        mostrarResultado(altura,base,area,perimetro);
    }

    private static double leerLado(String texto) {
        double lado;
        do{
            System.out.print(texto);
            try{
                lado=stdin.nextDouble();
                if(lado<=0){
                    throw new IllegalArgumentException("El valor introducido no es correcto. " +
                            "Introduzca un valor mayor que 0.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                System.out.println("El valor introducido no es correcto. Introduzca un valor numérico mayor que 0.");
                lado=0;
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                lado=0;
            }
        } while (lado==0);
        return lado;
    }

    private static double calcularArea(double altura, double base) {
        return base * altura;
    }

    private static double calcularPerimetro(double altura, double base) {
        return 2 * (base + altura);
    }

    private static void mostrarResultado(double altura, double base, double area, double perimetro) {
        System.out.println("**************************");
        System.out.println("RESULTADO FINAL");
        System.out.println("**************************");
        System.out.printf("Base:\t\t%.2f%n", base);
        System.out.printf("Altura:\t\t%.2f%n", altura);
        System.out.printf("Area:\t\t%.2f%n", area);
        System.out.printf("Perimetro:\t%.2f%n", perimetro);
    }
}
