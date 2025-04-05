package condicionales;

import java.util.Random;

public class EstructuraSwitch {

    public static void main(String[] args) {

        Random random = new Random();
        int nota = random.nextInt(0, 11);
        System.out.println("nota = " + nota);

        switch (nota){
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Calificación inválida");
                break;
        }

        //switch como expresión
        String calificacion = switch (nota) {
            case 0, 1, 2, 3, 4 -> "Insuficiente";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> "Calificación inválida";
        };

        System.out.println("calificacion = " + calificacion);
    }
}
