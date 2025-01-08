package utils;

import models.Triangulo;

import javax.swing.*;

public class Salida {

    private Salida(){
    }

    public static void mostrarResultado (Triangulo triangulo){
        String mensaje = """
                Base:   %.2f
                Altura: %.2f
                Area:   %.2f
                """.formatted(triangulo.getBase(), triangulo.getAltura(), triangulo.getArea());

        JOptionPane.showMessageDialog(null,mensaje,"Area Triangulo", JOptionPane.INFORMATION_MESSAGE);

    }
}
