import javax.swing.*;

public class VentanaDialogo {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "El numero introducido no es entero");
            main(args);
            //de este manera no vuelve a llamar a main
            System.exit(0);
        }

        //creamos los string
        String decimal = "Decimal = " + numeroDecimal;;
        String binario = "Binario = " + Integer.toBinaryString(numeroDecimal);
        String octal = "Octal = " + Integer.toOctalString(numeroDecimal);
        String hexadecimal = "Hexadecimal = " + Integer.toHexString(numeroDecimal);
        String mensaje = decimal + "\n" + binario + "\n" + octal + "\n" + hexadecimal;

        //imprimimos por pantalla
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
