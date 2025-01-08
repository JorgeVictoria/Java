package utils;

import javax.swing.*;

public class Entrada {

    private Entrada() {
    }

    public static double leerDatos(String textoPantalla){
        double valor=0.0;
        boolean esValido = false;
        while (!esValido){
            String entrada = JOptionPane.showInputDialog(textoPantalla);
            esValido=true;
            try{
                if(entrada==null||entrada.isEmpty()||entrada.isBlank()){
                    throw new IllegalArgumentException("Debe introducir algún valor.");
                }
                valor = Double.parseDouble(entrada);
                if(valor<=0){
                    throw new IllegalArgumentException("Debe introducir algún valor positivo.");
                }
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Debe introducir un valor numérico.",
                        "Error de Entrada", JOptionPane.WARNING_MESSAGE);
                esValido=false;
            } catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage(),
                        "Error de Entrada", JOptionPane.WARNING_MESSAGE);
                esValido=false;
            }
        }
        return valor;
    }
}
