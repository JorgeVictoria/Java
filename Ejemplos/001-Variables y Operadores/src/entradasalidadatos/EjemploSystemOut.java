package entradasalidadatos;

public class EjemploSystemOut {

    public static void main(String[] args) {

        int a = 10;
        double b = 3.1416;
        String nombre = "Ana";

        // 1. Imprimir con salto de línea
        System.out.println("Hola " + nombre + "!");

        // 2. Imprimir sin salto de línea
        System.out.print("El valor de a es: " + a);
        // Añadimos salto manual con \n
        System.out.print(" y el valor de b es: " + b + "\n");

        // 3. Imprimir usando formato (similar a printf en C)
        System.out.printf("El número %.2f con dos decimales y %d como entero %n", b, a);

        // 4. Imprimir varias líneas con println
        System.out.println("Primera línea");
        System.out.println("Segunda línea");
        System.out.println("Tercera línea");

        // 5. Combinar texto y variables
        System.out.println("Hola " + nombre + ", a + 5 = " + (a + 5));

        // 6. Mostrar caracteres especiales
        System.out.println("Ejemplo de tabulación:\tColumna 2");
        System.out.println("Ejemplo de nueva línea:\nSegunda línea");

        // 7. Text block con tres comillas
        // .formatted permite formatear como printf
        String mensaje = """
                ***Ejemplo de bloque de texto***
                Hola %s!
                    El valor de a es: %d
                        El valor de b con dos decimales es: %.2f
                Gracias por usar nuestro programa.
                """.formatted(nombre, a, b);

        // Mostrar el mensaje usando System.out
        System.out.println(mensaje);
    }
}
