package entrada;

import java.util.Locale;
import java.util.Scanner;

public class EntradaSalidaDatos {

    public static void main(String[] args) {
        //variables locales
        var sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.println("numero = " + numero);

        System.out.print("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();
        System.out.printf("El area del rectángulo es: %.2f", base*altura);

        //cierre del scanner
        sc.close();
    }
}
