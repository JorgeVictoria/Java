package operadores;

public class Aritmeticos {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);

        // Multiplicación
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);

        // División entera
        int division = a / b;
        System.out.println("División (entera): " + division);

        // División con decimales
        double divisionReal = (double) a / b;
        System.out.println("División (real): " + divisionReal);

        // Módulo (resto de la división)
        int modulo = a % b;
        System.out.println("Módulo: " + modulo);
    }
}
