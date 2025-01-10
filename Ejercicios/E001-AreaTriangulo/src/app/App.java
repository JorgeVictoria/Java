package app;

import javax.swing.*;

/*
 * Lee la base y la altura de un triángulo y muestra el área:
 * área = base x altura / 2
 */
public class App {

    private static final String TITULO = "Area Triángulo";
    private static final String VALOR_INCORRECTO = "Debe introducir un valor numérico positivo.";

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
            String entrada = JOptionPane.showInputDialog(null,texto,TITULO, JOptionPane.QUESTION_MESSAGE);
            esValido=true;
            try{
                if(entrada==null || entrada.isEmpty() || entrada.isBlank()){
                    throw new IllegalArgumentException(VALOR_INCORRECTO);
                }
                valor = Double.parseDouble(entrada);
                if(valor<=0){
                    throw new IllegalArgumentException(VALOR_INCORRECTO);
                }
            } catch (NumberFormatException ex){
                esValido=false;
                JOptionPane.showMessageDialog(null, VALOR_INCORRECTO,
                        TITULO, JOptionPane.WARNING_MESSAGE);
            } catch (IllegalArgumentException ex){
                esValido=false;
                JOptionPane.showMessageDialog(null, ex.getMessage(), TITULO, JOptionPane.WARNING_MESSAGE);
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

        JOptionPane.showMessageDialog(null, resultado, TITULO, JOptionPane.INFORMATION_MESSAGE);
    }

}
