package operadores;

import java.util.Random;

public class Logicos {

    public static void main(String[] args) {

        Random random = new Random();

        // Generar dos números aleatorios entre 0 y 10
        int a = random.nextInt(11);
        int b = random.nextInt(11);

        System.out.println("Número a: " + a);
        System.out.println("Número b: " + b);

        // Operador AND (&&)
        System.out.println("(a > 5) && (b > 5) : " + ((a > 5) && (b > 5)));

        // Operador OR (||)
        System.out.println("(a > 5) || (b > 5) : " + ((a > 5) || (b > 5)));

        // Operador NOT (!)
        System.out.println("!(a > b) : " + (!(a > b)));
    }
}
