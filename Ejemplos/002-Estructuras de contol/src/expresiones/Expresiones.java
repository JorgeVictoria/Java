package expresiones;

import java.util.Random;

public class Expresiones {

    public static void main(String[] args) {
        Random random = new Random();

        // Generar números aleatorios entre 1 y 10
        int a = random.nextInt(100) + 1;
        int b = random.nextInt(100) + 1;

        //operaciones aritmeticas
        a += 1;
        b += 20;
        double c = (double) b / 3;

        // Expresiones lógicas
        boolean esMayor = a > b;
        boolean dentroRango = (a >= 5) && (a <= 20);

        // Expresiones de incremento/decremento
        int contador = 0;
        contador++;

        // Expresión condicional (operador ternario)
        String mensaje = esMayor ? "a es mayor que b" : "a NO es mayor que b";

        // Expresión con llamada a método
        int longitudMensaje = mensaje.length();

        // Salida por consola
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("¿a es mayor que b?: " + esMayor);
        System.out.println("¿a está entre 5 y 20?: " + dentroRango);
        System.out.println("Contador = " + contador);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Longitud del mensaje: " + longitudMensaje);
    }
}
