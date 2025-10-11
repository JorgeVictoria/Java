package app;

/*El precio de final de venta de un ordenador portátil es la suma total de:
        - El coste de fabricación
        - El margen (en porcentaje) de beneficio de ganancia del vendedor
        - Los impuestos (calculados sobre el coste de fabricación más el margen de beneficio)
        .
   Si suponemos que la ganancia del vendedor va a ser del 30% de cada ordenador, y que el impuesto aplicable es del 21%,
   diseñar un programa que calcule el precio final del portátil y lo muestre por pantalla.
   El precio del coste de fabricación se debe obtener leyéndolo desde el teclado.

   Además de mostrar el precio final por consola, debe mostrar si el portátil tiene un precio NORMAL o DE LUJO
   mediante la siguiente fórmula:

        - Precio final <= 600 : NORMAL
        - Precio final > 600 : DE LUJO */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner stdin = new Scanner(System.in);
    private static final int PORCENTAJE_GANANCIA_VENDEDOR = 30;
    private static final int IMPUESTO_APLICABLE = 21;

    public static void main(String[] args) {

        //obtenemos el precio del coste de fabricación del producto
        double costeFabricacion = getCosteFabricacion();

        //calculamos el margen de ganancia del vendedor
        double margenGananciaVendedor = getMargenGananciaVendedor(costeFabricacion);

        //calculamos los impuestos
        double impuestos = getImpuestos(costeFabricacion,margenGananciaVendedor);

        //calculamos el precio final
        double precioFinal = getPrecioFinal(costeFabricacion,margenGananciaVendedor,impuestos);

        //calculamos el tipo de producto
        String tipoProducto = getTipoProducto(precioFinal);

        //imprimimos el resultado
        imprimirResultado(costeFabricacion,margenGananciaVendedor,impuestos,precioFinal,tipoProducto);

        //cerramos el scanner
        stdin.close();

    }

    private static double getCosteFabricacion() {

        double costeFabricacion;

        do{
            System.out.print("Precio Coste Fabricación: ");

            try{
                costeFabricacion = stdin.nextDouble();
                if(costeFabricacion<=0){
                    throw new IllegalArgumentException("Debe introducir un valor mayor que 0.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                System.out.println("El valor introducido no es correcto");
                costeFabricacion = 0.0;
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                costeFabricacion = 0.0;
            }
        } while (costeFabricacion==0.0);

        return costeFabricacion;
    }

    private static double getMargenGananciaVendedor(double costeFabricacion) {
        return costeFabricacion * PORCENTAJE_GANANCIA_VENDEDOR / 100;
    }

    private static double getImpuestos(double costeFabricacion, double margenGananciaVendedor) {
        return (costeFabricacion + margenGananciaVendedor) * IMPUESTO_APLICABLE / 100;
    }

    private static double getPrecioFinal(double costeFabricacion, double margenGananciaVendedor, double impuestos) {
        return costeFabricacion + margenGananciaVendedor + impuestos;
    }

    private static String getTipoProducto(double precioFinal) {
        return precioFinal <= 600 ? "NORMAL" : "lUJO";
    }

    private static void imprimirResultado(double costeFabricacion, double margenGananciaVendedor, double impuestos,
                                          double precioFinal, String tipoProducto) {

        System.out.printf("""
                        
                        *********************************
                        RESULTADO FINAL
                        *********************************
                        Coste Fabricación: %.2f Euros
                        Porcentaje Ganancia Vendedor: %d%%
                        Margen Ganancia Vendedor: %.2f Euros
                        Impuesto Aplicable: %d%%
                        Impuestos : %.2f Euros
                        Precio Final: %.2f Euros
                        Tipo de Producto: %s
                        %n""", costeFabricacion,PORCENTAJE_GANANCIA_VENDEDOR,margenGananciaVendedor,IMPUESTO_APLICABLE,
        impuestos,precioFinal,tipoProducto);
    }

}
