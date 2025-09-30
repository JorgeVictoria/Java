package bloques;

import java.util.Random;

public class Bloques {

    private static final String NUMERO = "numero: ";
    public static void main(String[] args) {
        // variable visible en la totalidad el método main
        Random random = new Random();
        int numero = random.nextInt(10) + 1;
        System.out.println("Número inicial: " + numero);

        if (numero > 5) {
            // Bloque del if
            // solo existe dentro del if
            int dentroIf = 100;
            System.out.println("Dentro del if:");
            // sí es visible
            System.out.println(NUMERO + numero);
            // sí es visible
            System.out.println("dentroIf: " + dentroIf);
        } else {
            // Bloque del else
            // solo existe dentro del else
            int dentroElse = 200;
            System.out.println("Dentro del else:");
            // sí es visible
            System.out.println(NUMERO + numero);
            // sí es visible
            System.out.println("dentroElse: " + dentroElse);
        }

        // Fuera del if-else
        System.out.println("Fuera del if-else:");
        // sigue siendo visible
        System.out.println(NUMERO + numero);

        // ❌ Estas variables ya no son visibles aquí:
        // System.out.println(dentroIf);
        // System.out.println(dentroElse);
    }
}
