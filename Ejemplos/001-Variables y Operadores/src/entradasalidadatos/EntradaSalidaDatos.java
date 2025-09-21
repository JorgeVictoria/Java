package entradasalidadatos;

import java.util.Scanner;

public class EntradaSalidaDatos {

    public static void main(String[] args) {

        // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos: nombre
        System.out.print("Introduce tu nombre: ");
        // Leer línea de texto
        String nombre = scanner.nextLine();

        // Entrada de datos: edad
        System.out.print("Introduce tu edad: ");
        // Leer número entero
        int edad = scanner.nextInt();

        // Salida de datos: mostrar mensaje
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        // Ejemplo de decisión
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Cerrar Scanner
        scanner.close();
    }
}
