package condiciones;

import java.util.Random;

public class SwitchExpresion {
    public static void main(String[] args) {
        Random random = new Random();

        // Generar una nota aleatoria entre 0 y 10
        int nota = random.nextInt(11); // [0-10]
        System.out.println("La nota del alumno es: " + nota);

        // Clasificación con switch
        // Switch como expresión
        String calificacion = switch (nota) {
            case 0, 1, 2, 3, 4 -> "Suspenso ❌";
            case 5 -> "Aprobado ✔️";
            case 6 -> "Bien 🙂";
            case 7, 8 -> "Notable 👍";
            case 9, 10 -> "Sobresaliente 🌟";
            default -> "Nota no válida";
        };

        // Mostrar resultado
        System.out.println("Calificación: " + calificacion);
    }
}
