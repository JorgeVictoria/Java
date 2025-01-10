package app;

import javax.swing.*;

/*
 * Crea un algoritmo llamado comparar que lea dos números
 * enteros positivos n1 y n2. Si el primero es mayor (n1 > n2)
 * escribir 1, si el segundo es mayor (n2 > n1) escribir 2 y si son
 * iguales escribir 0.
 */
public class App {

    private static final String COMPARAR = "COMPARAR";
    private static final String ENTERO_POSITIVO = "Debe introducir un valor entero positivo.";

    public static void main(String[] args) {

        //Entrada de datos
        int n1 = leerDatos("n1:");
        int n2 = leerDatos("n2");

        //calcular el area
        int resultado = compararNumeros(n1, n2);

        //mostrar resultado
        mostrarResultado(n1, n2, resultado);
    }

    private static int leerDatos(String texto) {
        int valor = 0;
        boolean esValido = false;
        while(!esValido){
            String entrada = JOptionPane.showInputDialog(null,texto,COMPARAR,JOptionPane.QUESTION_MESSAGE);
            esValido=true;
            try{
                if(entrada==null || entrada.isEmpty() || entrada.isBlank()){
                    throw new IllegalArgumentException(ENTERO_POSITIVO);
                }
                valor = Integer.parseInt(entrada);
                if(valor<=0){
                    throw new IllegalArgumentException(ENTERO_POSITIVO);
                }
            } catch (NumberFormatException ex){
                esValido=false;
                JOptionPane.showMessageDialog(null, ENTERO_POSITIVO,
                        COMPARAR, JOptionPane.WARNING_MESSAGE);
            } catch (IllegalArgumentException ex){
                esValido=false;
                JOptionPane.showMessageDialog(null, ex.getMessage(), COMPARAR, JOptionPane.WARNING_MESSAGE);
            }
        }
        return valor;
    }

    private static int compararNumeros(int n1, int n2)
    {
        if(n1 > n2){
            return 1;
        } else if (n1 < n2){
            return 2;
        } else {
            return 0;
        }
    }

    private static void mostrarResultado(int n1, int n2, int resultado) {
        String mensaje = """
                n1:              %d
                n2:              %d
                resultado: %d
                """.formatted(n1, n2, resultado);

        JOptionPane.showMessageDialog(null, mensaje, COMPARAR, JOptionPane.INFORMATION_MESSAGE);
    }

}
