import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatosConsola {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int decimal = 0;
        //Entrada de datos
        try{
            System.out.print("Numero Entero:");
            decimal = stdin.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Ingrese un numero entero");
            main(args);
            System.exit(0);
        }

        //salida de datos
        System.out.printf("decimal: %s%nbinario: %s%noctal: %s%nhexadecimal: %s",decimal,
                Integer.toBinaryString(decimal),Integer.toOctalString(decimal),Integer.toHexString(decimal));

    }
}
