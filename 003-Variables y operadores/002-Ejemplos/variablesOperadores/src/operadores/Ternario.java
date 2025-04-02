package operadores;

import java.util.Random;

public class Ternario {

    public static void main(String[] args) {

        Random random = new Random();
        int notaExamen = random.nextInt(11);
        String notaFinal = notaExamen < 5 ? "Suspenso" : "Aprobado";

        System.out.println("notaExamen = " + notaExamen);
        System.out.println("notaFinal = " + notaFinal);

    }
}
