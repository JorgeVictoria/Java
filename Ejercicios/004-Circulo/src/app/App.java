package app;

/*Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola. 
  El radio del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos el radio del círculo
        double radio = leerValor();

        //cerramos la entrada de datos
        stdin.close();
        
        //calculamos el área del círculo
        double area = calcularArea(radio);
        
        //calculamos el perímetro del círculo
        double perimetro = calcularPerimetro(radio);
        
        //imprimimos el resultado por pantalla
        imprimirResultado(radio, area, perimetro);
    }

    private static double leerValor() {
        double valor;
        do{
            System.out.print("Radio: ");

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

    private static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    private static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    private static void imprimirResultado(double radio, double area, double perimetro) {
        System.out.println("\n*********************************");
        System.out.println("         RESULTADO FINAL");
        System.out.println("*********************************");
        System.out.printf("Radio: %.2f%n", radio);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro : %.2f%n", perimetro);
    }
}
