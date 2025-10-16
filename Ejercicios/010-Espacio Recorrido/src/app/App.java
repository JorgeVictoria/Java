package app;

/* Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto, como por ejemplo,
   una sonda espacial, que se mueve a velocidad constante.
   Podemos suponer que el objeto ha recorrido un espacio inicial de 150.000 km y
   se mueve a una velocidad 17 km por segundo.
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Cálculo del espacio recorrido (MRU) ===");

        // Pedir datos al usuario
        System.out.print("Ingrese la posición inicial (en km): ");
        double posicionInicial = entrada.nextDouble();

        System.out.print("Ingrese la velocidad constante (en km/s): ");
        double velocidad = entrada.nextDouble();

        System.out.print("Ingrese el tiempo transcurrido (en segundos): ");
        double tiempo = entrada.nextDouble();

        // Calcular espacio total recorrido
        double posicionFinal = posicionInicial + velocidad * tiempo;

        // Mostrar resultado
        System.out.println("\n--- Resultados ---");
        System.out.println("Posición inicial: " + posicionInicial + " km");
        System.out.println("Velocidad: " + velocidad + " km/s");
        System.out.println("Tiempo: " + tiempo + " s");
        System.out.println("Posición final: " + posicionFinal + " km");

        entrada.close();
    }
}
