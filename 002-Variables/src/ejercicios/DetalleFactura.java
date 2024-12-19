package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleFactura {
    private static final int IMPUESTO = 19;
    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //variables locales
        String nomFactura;
        double precio01;
        double precio02;
        double valorImpuesto;

        //pedimos el nombre de la factura
        System.out.print("Nombre de la factura: ");
        nomFactura = stdin.nextLine();

        //ahora pedimos el precio del producto
        precio01 = pedirPrecio("Precio01");
        precio02 = pedirPrecio("Precio02");

        //calculamos el importe del impuesto
        valorImpuesto = (precio01+precio02)*IMPUESTO/100;

        //mostramos por pantalla el resultado
        System.out.println();
        System.out.println("***************");
        System.out.println("*   Ticket    *");
        System.out.println("***************");
        System.out.printf("Factura: %s%n", nomFactura);
        System.out.printf("Producto A: %.2f%n", precio01);
        System.out.printf("Producto B: %.2f%n", precio02);
        System.out.printf("IVA: %d%%%n", IMPUESTO);
        System.out.printf("Total IVA: %.2f%n", valorImpuesto);
        System.out.printf("Precio Total: %.2f%n", precio01+precio02+valorImpuesto);
    }

    private static double pedirPrecio(String string) {

        //variables locales
        double precio = 0;
        boolean esValido = false;

        //mientras no estemos seguros que el precio sea valido, permanecemos en el bucle pidiendo el precio
        while(!esValido) {
            //pedimos el precio
            System.out.print("Introduce el " + string + ": ");
            //comprobamos que el precio sea correcto
            try {
                //vamos a pensar que el precio introducido es correcto y podremos salir del bucle
                esValido = true;
                //leemos el precio de la entrada del teclado
                precio = stdin.nextDouble();
                //el precio no puede ser negativo
                if(precio<0){
                    throw new IllegalArgumentException("El precio introducido es incorrecto");
                }
                //capturamos la excepcion
            } catch (InputMismatchException e) {
                //limpiamos la entrada, hemos podido introducir una cadena
                stdin.next();
                //permaneceremos en el bucle
                esValido= false;
                //imprimimos mensaje por pantalla
                System.out.println("El precio introducido es incorrecto");
            } catch (IllegalArgumentException e) {
                //permaneceremos en el bucle
                esValido= false;
                //imprimimos mensaje por pantalla
                System.out.println(e.getMessage());
            }
        }
        //cuando esValido sea true, habremos salido del bucle y podemos retornar el valor introducido
        //podríamos evaluar que el precio sea negativo, pero como es factura podría tratarse como una devolución
        return precio;
    }
}

