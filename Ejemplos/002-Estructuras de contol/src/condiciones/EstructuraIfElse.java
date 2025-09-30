package condiciones;

import java.util.Random;

public class EstructuraIfElse {
    public static void main(String[] args) {
        Random random = new Random();

        // Edad aleatoria entre 0 y 100
        // nextInt(101) da [0-100]
        int edad = random.nextInt(101);
        System.out.println("La persona tiene " + edad + " años.");

        // Clasificación según la edad
        if (edad < 18) {
            System.out.println("Es menor de edad.");
        } else if (edad < 65) {
            System.out.println("Está en edad de trabajar.");
        } else {
            System.out.println("Ya está jubilado.");
        }
    }
}
