package utils;

import models.ComparadorNumeros;

import javax.swing.*;

public class Salida {

    private Salida(){
    }

    public static void mostrarResultado (ComparadorNumeros comparadorNumeros){
        String mensaje = """
                NumA:      %d
                NumB:      %d
                Resultado: %d
                """.formatted(comparadorNumeros.getNumA(), comparadorNumeros.getNumB(),
                comparadorNumeros.compararNumeros());

        JOptionPane.showMessageDialog(null,mensaje,"Comparar", JOptionPane.INFORMATION_MESSAGE);

    }
}
