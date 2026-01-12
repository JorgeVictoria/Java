package app;

/* El precio de final de venta de un ordenador portátil es la suma total de:
        - El coste de fabricación
        - El margen (en porcentaje) de beneficio de ganancia del vendedor
        - Los impuestos (calculados sobre el coste de fabricación más el margen de beneficio).
        - Si suponemos que:
            -la ganancia del vendedor va a ser del 30% de cada ordenador,
            -y que el impuesto aplicable es del 21%,
           diseñar un programa que calcule el precio final del portátil y lo muestre por pantalla.

           El precio del coste de fabricación se debe obtener leyéndolo desde el teclado.

        Además de mostrar el precio final por consola, debe mostrar si el portátil tiene un precio NORMAL o DE LUJO
         mediante la siguiente fórmula:

        Precio final <= 600: NORMAL
        Precio final > 600: DE LUJO
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);
    private static final int PORCENTAJE_GANANCIA_VENDEDOR = 30;
    private static final int IMPUESTO_APLICABLE = 21;

    public static void main(String[] args) {
        //pedimos el valor inicial del producto
        double valorInicialProducto = leerValor();

        //cerramos la entrada de datos
        stdin.close();

        //calculamos el total de la ganancia del vendedor
        double totalGananciaVendedor = calcularTotalGananciaVendedor(valorInicialProducto);

        //calculamos el total del impuesto
        double totalValorImpuesto = calcularTotalValorImpuesto(valorInicialProducto, totalGananciaVendedor);

        //calculamos el valor final del producto
        double valorFinalProducto = calcularValorFinalProducto(valorInicialProducto, totalGananciaVendedor,
                totalValorImpuesto);

        //calculamos el tipo de producto
        String tipoProducto = calcularTipoProducto(valorFinalProducto);

        //mostrar resultado
        mostrarResultadoFinal(valorInicialProducto, valorFinalProducto, totalGananciaVendedor, totalValorImpuesto,
                tipoProducto);
    }

    private static double leerValor() {
        double valor;
        do{
            System.out.print("Precio Inicial Producto: ");
            try{
                valor=stdin.nextDouble();
                if(valor<0){
                    throw new IllegalArgumentException("El valor introducido no puede ser negativo.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                System.out.println("El valor introducido no es correcto.");
                valor=-1;
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                valor=-1;
            }
        } while (valor==-1);
        return valor;
    }

    private static double calcularTotalGananciaVendedor(double valorInicialProducto) {
        return valorInicialProducto * PORCENTAJE_GANANCIA_VENDEDOR / 100;
    }

    private static double calcularTotalValorImpuesto(double valorInicialProducto, double totalGananciaVendedor) {
        return (valorInicialProducto + totalGananciaVendedor) * IMPUESTO_APLICABLE / 100;
    }

    private static double calcularValorFinalProducto(double valorInicialProducto, double totalGananciaVendedor,
                                                     double totalValorImpuesto) {
        return valorInicialProducto + totalGananciaVendedor + totalValorImpuesto;
    }

    private static String calcularTipoProducto(double valorFinalProducto) {
        return valorFinalProducto > 600 ? "DE LUJO" : "NORMAL";
    }

    private static void mostrarResultadoFinal(double valorInicialProducto, double valorFinalProducto,
                                              double totalGananciaVendedor, double totalValorImpuesto,
                                              String tipoProducto) {
        System.out.println("**************************");
        System.out.println("RESULTADO FINAL");
        System.out.println("**************************");
        System.out.printf("Valor Inicial Producto:\t\t %.2f Euros %n", valorInicialProducto);
        System.out.printf("Impuesto Ganancia Vendedor:\t %d%%%n", PORCENTAJE_GANANCIA_VENDEDOR);
        System.out.printf("Valor Ganancia Vendedor:\t %.2f Euros %n", totalGananciaVendedor);
        System.out.printf("Impuesto Aplicable:\t\t\t %d%%%n", IMPUESTO_APLICABLE);
        System.out.printf("Valor Impuesto Aplicable:\t %.2f Euros %n", totalValorImpuesto);
        System.out.printf("Valor Final Producto:\t\t %.2f Euros %n", valorFinalProducto);
        System.out.printf("Tipo de producto:\t\t\t %s", tipoProducto);
    }
}
