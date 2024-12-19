import javax.swing.*;

public class EntradaDatosVentana {
    public static void main(String[] args) {
        int decimal = 0;
        //Entrada de datos
        try{
            decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero Entero"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Ingrese un numero entero");
            main(args);
            System.exit(0);
        }

        //binario
        int binario = Integer.parseInt(Integer.toBinaryString(decimal));

        //octal
        int octal = Integer.parseInt(Integer.toOctalString(decimal));

        //hexadecimal
        int hexadecimal = Integer.parseInt(Integer.toHexString(decimal));

        //cadena
        String resultado = String.format("decimal: %d\nbinario: %d\noctal: %d\nhexadecimal: %d",decimal,binario,octal,hexadecimal);

        //salida de datos
        JOptionPane.showMessageDialog(null,resultado);
    }
}
