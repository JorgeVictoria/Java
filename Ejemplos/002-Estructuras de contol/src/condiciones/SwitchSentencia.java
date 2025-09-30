package condiciones;

import java.util.Random;

public class SwitchSentencia {
    public static void main(String[] args) {
        Random random = new Random();

        // Generar una nota aleatoria entre 0 y 10
        int nota = random.nextInt(11); // [0-10]
        System.out.println("La nota del alumno es: " + nota);

        // Clasificación con switch
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Suspenso ❌");
                break;
            case 5:
                System.out.println("Aprobado ✔️");
                break;
            case 6:
                System.out.println("Bien 🙂");
                break;
            case 7,8:
                System.out.println("Notable 👍");
                break;
            case 9, 10:
                System.out.println("Sobresaliente 🌟");
                break;
            default:
                System.out.println("Nota no válida");
        }
    }
}
