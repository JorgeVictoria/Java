package bucles;

import java.util.Random;

public class BucleFor {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroEstudiantes = 15;

        for (int i = 1; i <= numeroEstudiantes; i++) {
            // genera notas entre -1 y 10
            int nota = random.nextInt(12) - 1;
            System.out.println("Estudiante " + i + " tiene nota: " + nota);

            // Saltar notas negativas o inválidas
            if (nota < 0) {
                System.out.println("Nota inválida, se ignora.\n");
                // pasa a la siguiente iteración
                continue;
            }

            // Si encontramos un 10, detener el bucle
            if (nota == 10) {
                System.out.println("¡Nota perfecta encontrada! Deteniendo el bucle.\n");
                // sale del bucle
                break;
            }

            // Mostrar calificación cualitativa
            String calificacion = switch (nota) {
                case 0,1,2,3,4 -> "Suspenso ❌";
                case 5 -> "Aprobado ✔️";
                case 6 -> "Bien 🙂";
                case 7,8 -> "Notable 👍";
                case 9 -> "Sobresaliente 🌟";
                default -> "Nota no válida";
            };

            System.out.println("Calificación: " + calificacion + "\n");
        }
    }
}
