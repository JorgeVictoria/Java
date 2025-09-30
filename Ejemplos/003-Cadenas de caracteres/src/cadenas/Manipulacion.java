package cadenas;

public class Manipulacion {

    public static void main(String[] args) {
        // 1. Concatenación de cadenas
        String nombre = "Ana";
        String apellido = "Pérez";
        // concatenación con +
        String nombreCompleto = nombre + " " + apellido;
        String saludo = "Hola, " + nombreCompleto + " 👋";

        // 2. Escape de caracteres
        String cita = "Ella dijo: \"La programación en Java es divertida\"";
        String ruta = "C:\\Users\\Ana\\Documentos\\java";
        String multilinea = "Primera línea\nSegunda línea\n\tCon tabulación";

        // 3. Formateo de cadenas con String.format()
        int edad = 25;
        double promedio = 8.75;
        String info = String.format("Nombre: %s %s | Edad: %d | Promedio: %.2f",
                nombre, apellido, edad, promedio);

        // También se puede usar printf directamente
        System.out.printf("Alumno: %s %s | Edad: %d | Promedio: %.1f%n",
                nombre, apellido, edad, promedio);

        // ---- Imprimir resultados ----
        System.out.println(saludo);
        System.out.println("Cita con comillas: " + cita);
        System.out.println("Ruta con backslashes: " + ruta);
        System.out.println("Texto con saltos y tabulaciones:\n" + multilinea);
        System.out.println("Información formateada: " + info);
    }
}
