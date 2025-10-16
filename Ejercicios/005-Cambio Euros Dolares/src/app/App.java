package app;

/*Escribir un programa que, dada una cantidad de euros, nos indique cuál es su valor en dólares americanos.
Además de la variable para la cantidad de euros, se debe declarar otra para el cambio (el valor de un dólar en euros)
 y para el resultado final. Muestra el resultado por consola.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //pedimos el valor de la cantidad de euros que queremos cambiar
        double cantidad = leerValor("Euros: ");

        //pedimos el tipo de cambio (valor de 1 euros en dólares
        double tipoCambio = leerValor("Tipo de cambio: ");

        //calculamos el valor de la cantidad de euros en dólares
        double cambio = calcularCambio(cantidad, tipoCambio);

        //imprimimos el resultado en pantalla
        imprimirResultado(cantidad, tipoCambio, cambio);

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

    private static double calcularCambio(double cantidad, double tipoCambio) {
        return cantidad * tipoCambio;
    }

    private static void imprimirResultado(double cantidad, double tipoCambio, double cambio) {
        System.out.println("\n*********************************");
        System.out.println("         RESULTADO FINAL");
        System.out.println("*********************************");
        System.out.printf("Cantidad: %.2f Euros %n", cantidad);
        System.out.printf("1 Euro : %.2f USD%n", tipoCambio);
        System.out.printf("Cambio: %.2f USD%n", cambio);
    }
}
