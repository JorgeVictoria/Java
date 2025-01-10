package app;

import javax.swing.*;

/*
 * Lee la base y la altura de un triángulo y muestra el área:
 * área = base x altura / 2
 */
public class App {

    private static final String AREA_TRIANGULO = "Area Triangulo";

    public static void main(String[] args) {

        //Entrada de datos
        double base = leerDatos("Base:");
        double altura = leerDatos("Altura");

        //calcular el area
        double area = calcularArea(base, altura);

        //mostrar resultado
        mostrarResultado(base, altura, area);
    }

    private static double leerDatos(String texto) {
        double valor = 0.0;
        boolean esValido = false;
        while(!esValido){
            String entrada = JOptionPane.showInputDialog(texto);
            esValido=true;
            try{
                if(entrada==null || entrada.isEmpty() || entrada.isBlank()){
                    throw new IllegalArgumentException("Debe introducir un valor numérico.");
                }
                valor = Double.parseDouble(entrada);
                if(valor<=0){
                    throw new IllegalArgumentException("Debe introducir un valor numérico positivo.");
                }
            } catch (NumberFormatException ex){
                esValido=false;
                JOptionPane.showMessageDialog(null, "Debe introducir un valor numérico.",
                        AREA_TRIANGULO, JOptionPane.WARNING_MESSAGE);
            } catch (IllegalArgumentException ex){
                esValido=false;
                JOptionPane.showMessageDialog(null, ex.getMessage(), AREA_TRIANGULO, JOptionPane.WARNING_MESSAGE);
            }
        }
        return valor;
    }

    private static double calcularArea(double base, double altura) {
        return base * altura / 2;
    }

    private static void mostrarResultado(double base, double altura, double area) {
        String resultado = """
                Base:   %.2f
                Altura: %.2f
                Area:   %.2f
                """.formatted(base, altura, area);

        JOptionPane.showMessageDialog(null, resultado, AREA_TRIANGULO, JOptionPane.INFORMATION_MESSAGE);
    }

}
