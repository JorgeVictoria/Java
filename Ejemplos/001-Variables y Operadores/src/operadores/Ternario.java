package operadores;

import java.util.Random;

public class Ternario {

    public static void main(String[] args) {

        Random random = new Random();

        // 0 a 10
        int a = random.nextInt(11);
        int b = random.nextInt(11);

        System.out.println("Número a: " + a);
        System.out.println("Número b: " + b);

        // Usando operador ternario para determinar el mayor
        int mayor = (a > b) ? a : b;
        System.out.println("El número mayor es: " + mayor);

        // Ternario con texto
        String resultado = (a == b) ? "a y b son iguales" : "a y b son diferentes";
        System.out.println(resultado);

        // Ternario para verificar si a es par o impar
        String parImpar = (a % 2 == 0) ? "a es par" : "a es impar";
        System.out.println(parImpar);
    }
}
