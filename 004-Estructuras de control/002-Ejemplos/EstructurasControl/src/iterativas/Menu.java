package iterativas;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("1. Saludar en español");
            System.out.println("2. Saludar en inglés");
            System.out.println("0. Salir");
            System.out.println();
            System.out.print("Seleccione una opción:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Hola");
                case 2 -> System.out.println("Hello");
                case 0 -> System.out.println("Hasta luego");
                default -> System.out.println("La opción seleccionada no es válida.");
            }
        } while (opcion != 0);
    }
}
