package operadores;

import java.util.Random;

public class Comparacion {

    public static void main(String[] args) {

        Random random = new Random();

        // Generar dos números aleatorios entre 0 y 10
        int a = random.nextInt(11);
        int b = random.nextInt(11);

        System.out.println("Número a: " + a);
        System.out.println("Número b: " + b);

        // Igualdad
        System.out.println("a == b : " + (a == b)); // false

        // Desigualdad
        System.out.println("a != b : " + (a != b)); // true

        // Mayor que
        System.out.println("a > b : " + (a > b)); // true

        // Menor que
        System.out.println("a < b : " + (a < b)); // false

        // Mayor o igual que
        System.out.println("a >= b : " + (a >= b)); // true

        // Menor o igual que
        System.out.println("a <= b : " + (a <= b)); // false
    }
}
