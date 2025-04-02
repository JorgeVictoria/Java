package app;

/*
 * El precio de final de venta de un ordenador portátil es la suma total de:
 * El coste de fabricación
 * El margen (en porcentaje) de beneficio de ganancia del vendedor
 * Los impuestos (calculados sobre el coste de fabricación más el margen de beneficio).
 * Si suponemos que la ganancia del vendedor va a ser del 30% de cada ordenador, y que el impuesto aplicable es del 21%,
 * diseñar un programa que calcule el precio final del portátil y lo muestre por pantalla.
 * El precio del coste de fabricación se debe obtener leyéndolo desde el teclado.
 *
 * Además de mostrar el precio final por consola, debe mostrar si el portátil tiene un precio NORMAL o DE LUJO
 * mediante la siguiente fórmula:
 *
 * Precio final <= 600 : NORMAL
 * Precio final > 600: DE LUJO
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrecioFinal {

    private static final Scanner stdin = new Scanner(System.in);
    private static final  int PORCENTAJE_GANANCIA_VENDEDOR = 30;
    private static final  int PORCENTAJE_IMPUESTO = 21;
    private static final int PRECIO_LIMITE = 600;
    private static final String NORMAL = "NORMAL";
    private static final String DE_LUJO = "DE LUJO";

    public static void main(String[] args) {

        //solicitar el precio del ordenador
        double precio = introducirPrecio();

        //calcular la ganancia del vendedor
        double gananciaVendedor = calcularGananciaVendedor(precio);

        //calcular el total de impuestos
        double totalImpuestos = calcularTotalImpuestos(gananciaVendedor, precio);

        //calcular el precio final
        double precioFinal = calcularPrecioFinal(precio, gananciaVendedor, totalImpuestos);

        //calcular tipo de producto
        String tipoProducto = calcularTipoProducto(precioFinal);

        //Imprimir resultado
        imprimirResultado(precio, gananciaVendedor, totalImpuestos, precioFinal, tipoProducto);

        //Cerramos la entrada de datos
        stdin.close();
    }

    private static double introducirPrecio() {
        //variables locales
        double precio = 0.0;
        boolean esValorValido = false;

        while(!esValorValido){
            System.out.print("Precio producto:");
            try{
                precio = stdin.nextDouble();
                esValorValido = true;
                if(precio< 0){
                    throw new IllegalArgumentException("El valor del precio no puede ser negativo.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                esValorValido = false;
                System.out.println("El valor introducido no es valido.");
            } catch (IllegalArgumentException ex){
                esValorValido = false;
                System.out.println(ex.getMessage());
            }
        }
        return precio;
    }

    private static double calcularGananciaVendedor(double precio) {
        return precio * PORCENTAJE_GANANCIA_VENDEDOR / 100;
    }

    private static double calcularTotalImpuestos(double gananciaVendedor, double precio) {
        return (precio + gananciaVendedor) * PORCENTAJE_IMPUESTO / 100;
    }

    private static double calcularPrecioFinal(double precio, double gananciaVendedor, double totalImpuestos) {
        return precio + gananciaVendedor + totalImpuestos;
    }

    private static String calcularTipoProducto(double precioFinal) {
        return precioFinal <= PRECIO_LIMITE ? NORMAL : DE_LUJO;
    }

    private static void imprimirResultado(double precio, double gananciaVendedor, double totalImpuestos,
                                          double precioFinal, String tipoProducto) {
        System.out.println();
        System.out.printf("""
                **************************
                        RESULTADO
                **************************
                Precio Original   : %.2f
                Ganancia Vendedor : %.2f
                Impuestos         : %.2f
                Precio Final      : %.2f
                Tipo Producto     : %s
                %n""", precio,gananciaVendedor,totalImpuestos,precioFinal,tipoProducto);
    }
}
