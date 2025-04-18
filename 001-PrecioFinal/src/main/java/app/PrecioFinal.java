package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrecioFinal {

    private final static Scanner stdin = new Scanner(System.in);
    private final static int porcentajeGananciaVendedor = 30;
    private final static int porcentajeIVA = 21;

    private final static String PRECIO_INICIAL = "Precio Inicial";

    public static void main(String[] args) {
        //obtenemos el precio inicial del portátil
        double precioInicial = getPrecioInicial();

        //calculamos la ganancia del vendedor
        double gananciaVendedor = getGananciaVendedor(precioInicial);

        //calculamos los impuestos
        double impuestos = getImpuestos(precioInicial, gananciaVendedor);

        //calculamos el precio final
        double precioFinal = getPrecioFinal(precioInicial, gananciaVendedor, impuestos);

        //calculamos el tipo de producto
        String tipoProducto = getTipoProducto(precioFinal);

        //imprimir el resultado por pantalla
        imprimirResultado(precioInicial, gananciaVendedor, impuestos, precioFinal, tipoProducto);

        //cerramos el scanner
        stdin.close();
    }

    private static double getPrecioInicial() {
        double precioInicial = 0.0;
        boolean esPrecioValido = false;
        while (!esPrecioValido){
            System.out.print(PRECIO_INICIAL.concat(" : "));
            try{
                precioInicial = stdin.nextDouble();
                esPrecioValido = true;
                if(precioInicial < 0){
                    throw new IllegalArgumentException("Precio incorrecto. El precio no puede ser negativo.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                esPrecioValido = false;
                System.out.println("Precio incorrecto. Introduzca un valor numérico.");
            } catch (IllegalArgumentException ex){
                esPrecioValido = false;
                System.out.println(ex.getMessage());
            }
        }
        return precioInicial;
    }

    private static double getGananciaVendedor(double precioInicial) {
        return precioInicial * porcentajeGananciaVendedor / 100;
    }

    private static double getImpuestos(double precioInicial, double gananciaVendedor) {
        return (precioInicial + gananciaVendedor) * porcentajeIVA / 100;
    }

    private static double getPrecioFinal(double precioInicial, double gananciaVendedor, double impuestos) {
        return precioInicial + gananciaVendedor + impuestos;
    }

    private static String getTipoProducto(double precioFinal) {
        if (precioFinal <= 600) return "NORMAL";
        else return "DE LUJO";
    }

    private static void imprimirResultado(double precioInicial, double gananciaVendedor, double impuestos,
                                          double precioFinal, String tipoProducto) {
        System.out.printf("""
        *******************
        *    RESULTADO    *
        *******************
        Precio Inicial \t\t\t: %.2f
        Ganancia Vendedor(%d%s) \t: %.2f
        Impuestos(%d%s) \t\t\t: %.2f
        Precio Final \t\t\t: %.2f
        Tipo Producto \t\t\t: %s
        %n""", precioInicial, porcentajeGananciaVendedor,"%" ,gananciaVendedor,porcentajeIVA,"%", impuestos,
        precioFinal, tipoProducto);
    }
}
