package variables;

public class Primitivos {

    private static final String BYTES = " | bytes: ";
    private static final String RANGO = " | rango: ";

    public static void main(String[] args) {

        // Enteros
        byte b = 100;
        short s = 1000;
        int i = 50000;
        long l = 10000000000L;

        // Flotantes
        float f = 3.14f;
        double d = 3.14159265;

        // Carácter
        char c = 'A';

        // Booleano
        boolean flag = true;

        // Mostrar valores, rangos y tamaño en bytes
        System.out.println("=== Tipos Enteros ===");
        System.out.println("byte: " + b + BYTES + Byte.BYTES + RANGO + Byte.MIN_VALUE + " a "
                + Byte.MAX_VALUE);
        System.out.println("short: " + s + BYTES + Short.BYTES + RANGO + Short.MIN_VALUE + " a "
                + Short.MAX_VALUE);
        System.out.println("int: " + i + BYTES + Integer.BYTES + RANGO + Integer.MIN_VALUE + " a "
                + Integer.MAX_VALUE);
        System.out.println("long: " + l + BYTES + Long.BYTES + RANGO + Long.MIN_VALUE + " a "
                + Long.MAX_VALUE);

        System.out.println("\n=== Tipos Flotantes ===");
        System.out.println("float: " + f + BYTES + Float.BYTES + RANGO + Float.MIN_VALUE + " a "
                + Float.MAX_VALUE);
        System.out.println("double: " + d + BYTES + Double.BYTES + RANGO + Double.MIN_VALUE + " a "
                + Double.MAX_VALUE);

        System.out.println("\n=== Carácter ===");
        System.out.println("char: " + c + BYTES + Character.BYTES + RANGO + (int) Character.MIN_VALUE
                + " a " + (int) Character.MAX_VALUE);

        System.out.println("\n=== Booleano ===");
        System.out.println("boolean: " + flag
                + " | bytes: (depende de la JVM, típicamente 1) | valores posibles: true o false");

    }
}
