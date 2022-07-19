package Ejercicio002;

import java.util.Scanner;

public class Factura {

    //variables de la clase
    private static final int IVA = 19;
    private static Double precio1;
    private static Double precio2;
    private static Double precioBruto;
    private static Double valorImpuesto;
    private static Double precioFinal;
    private static Scanner stdin = new Scanner(System.in);
    private static String nombreFactura;

    public static void main(String[] args) {

        //pedimos el nombre de la factura
        System.out.printf("Introduzca el nombre de la factura: ");
        nombreFactura = stdin.nextLine();

        //pedimos los precios
        precio1 = obtenerPrecio("precio1");
        precio2 = obtenerPrecio("precio2");

        //calculamos precios
        calcularPrecios();

        //imprimir factura
        System.out.printf("La factura %s tiene un total bruto de %.2f, con un impuesto de %.2f y un precio final de %.2f", nombreFactura,precioBruto,valorImpuesto,precioFinal);


    }

    private static Double obtenerPrecio(String unPrecio){

        //variables locales
        Double precio = 0.0;
        boolean esDouble = false;

        //comprobamos que el precio sea double y mayor que 0
        while (!esDouble){
            try {
                System.out.printf("Introduzca el " + unPrecio + " : ");
                precio = stdin.nextDouble();
                esDouble = true;
            } catch (Exception e){
                stdin.next();
                esDouble = false;
                System.out.println("El valor introducido no es correcto");
            }
            if(esDouble && precio <=0){
                esDouble = false;
                System.out.println("El valor deber ser mayor que 0");
            }
        }

        //devolvemos el precio
        return precio;

    }

    private static void calcularPrecios() {

        precioBruto = precio1 + precio2;
        valorImpuesto = precioBruto * 19 / 100;
        precioFinal = precioBruto + valorImpuesto;

    }

}
