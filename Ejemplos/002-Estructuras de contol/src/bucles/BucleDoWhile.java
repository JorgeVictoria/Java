package bucles;

import java.util.Random;

public class BucleDoWhile {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroEstudiantes = 15;
        // contador manual
        int i = 1;

        do {
            // genera notas entre -1 y 10
            int nota = random.nextInt(12) - 1;
            System.out.println("Estudiante " + i + " tiene nota: " + nota);

            // Saltar notas inválidas
            if (nota < 0) {
                System.out.println("Nota inválida, se ignora.\n");
                i++;
                // pasa a la siguiente iteración
                continue;
            }

            // Detener si encontramos un 10
            if (nota == 10) {
                System.out.println("¡Nota perfecta encontrada! Deteniendo el bucle.\n");
                // sale del bucle
                break;
            }

            // Clasificación con switch expresión
            String calificacion = switch (nota) {
                case 0,1,2,3,4 -> "Suspenso ❌";
                case 5 -> "Aprobado ✔️";
                case 6 -> "Bien 🙂";
                case 7,8 -> "Notable 👍";
                case 9 -> "Sobresaliente 🌟";
                default -> "Nota no válida";
            };

            System.out.println("Calificación: " + calificacion + "\n");

            // incrementar al final
            i++;

        } while (i <= numeroEstudiantes);
    }
}
