package variables;

public class Casting {

    public static void main(String[] args) {

        // === Casting implícito (widening) ===
        // Un byte puede almacenarse en un int automáticamente
        byte b = 100;
        int i = b;

        // Un int cabe en un long sin pérdida de datos
        long l = i;

        // Un long puede convertirse automáticamente en float
        float f = l;

        // Un float puede convertirse automáticamente en double
        double d = f;

        System.out.println("Casting implícito:");
        System.out.println("byte → int: " + i);
        System.out.println("int → long: " + l);
        System.out.println("long → float: " + f);
        System.out.println("float → double: " + d);

        // === Casting explícito (narrowing) ===
        // Un double necesita conversión explícita para ser int (se pierde la parte decimal)
        double d2 = 9.78;
        int i2 = (int) d2;

        // Un int necesita casting para ser short (posible pérdida de rango)
        short s2 = (short) i2;

        // Un short necesita casting para ser byte (puede desbordar)
        byte b2 = (byte) s2;

        System.out.println("\nCasting explícito:");
        System.out.println("double → int: " + i2);
        System.out.println("int → short: " + s2);
        System.out.println("short → byte: " + b2);

        // === Casting entre char y numéricos ===
        // Un char se puede convertir automáticamente en int (representa código Unicode)
        char c = 'A';
        int code = c;

        // Un int requiere casting explícito para volver a ser char
        char c2 = (char) (code + 1);

        System.out.println("\nCasting entre char y numéricos:");
        System.out.println("char 'A' → int: " + code);
        System.out.println("int 66 → char: " + c2);

        // === Casting boolean (no permitido en Java) ===
        // boolean no puede convertirse a numérico ni viceversa
        boolean flag = true;
        //int num = (int) flag; // ❌ No compila

        System.out.println("\nNota: No se puede hacer casting directo con boolean en Java.");
    }
}
