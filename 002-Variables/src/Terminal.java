import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        //Variables locales
        Scanner scanner = new Scanner(System.in);
        int numeroDecimal = 0;

        //entrada de datos
        System.out.printf("Ingrese un numero entero: ");
        try{
            numeroDecimal = scanner.nextInt();
        } catch(Exception e){
            System.out.println("El numero introducido no es entero");
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
        System.out.println(mensaje);
    }
}
