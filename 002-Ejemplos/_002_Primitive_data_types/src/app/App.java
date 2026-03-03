package app;

public class App {

	public static void main(String[] args) {
		
		// ===============================
        // 1. byte
        // ===============================
        byte exampleByte = 100;

        System.out.println("Type: byte");
        System.out.println("Bits: 8");
        System.out.println("Bytes: 1");
        System.out.println("Minimum value: " + Byte.MIN_VALUE);
        System.out.println("Maximum value: " + Byte.MAX_VALUE);
        System.out.println("Example declaration: byte exampleByte = 100;");
        System.out.println("----------------------------------");


        // ===============================
        // 2. short
        // ===============================
        short exampleShort = 20000;

        System.out.println("Type: short");
        System.out.println("Bits: 16");
        System.out.println("Bytes: 2");
        System.out.println("Minimum value: " + Short.MIN_VALUE);
        System.out.println("Maximum value: " + Short.MAX_VALUE);
        System.out.println("Example declaration: short exampleShort = 20000;");
        System.out.println("----------------------------------");


        // ===============================
        // 3. int
        // ===============================
        int exampleInt = 100000;

        System.out.println("Type: int");
        System.out.println("Bits: 32");
        System.out.println("Bytes: 4");
        System.out.println("Minimum value: " + Integer.MIN_VALUE);
        System.out.println("Maximum value: " + Integer.MAX_VALUE);
        System.out.println("Example declaration: int exampleInt = 100000;");
        System.out.println("----------------------------------");


        // ===============================
        // 4. long
        // ===============================
        long exampleLong = 10000000000L; // L suffix required

        System.out.println("Type: long");
        System.out.println("Bits: 64");
        System.out.println("Bytes: 8");
        System.out.println("Minimum value: " + Long.MIN_VALUE);
        System.out.println("Maximum value: " + Long.MAX_VALUE);
        System.out.println("Example declaration: long exampleLong = 10000000000L;");
        System.out.println("----------------------------------");


        // ===============================
        // 5. float
        // ===============================
        float exampleFloat = 3.14f;              // f suffix required
        float scientificFloat = 1.23e2f;         // 1.23 × 10^2 = 123.0

        System.out.println("Type: float");
        System.out.println("Bits: 32");
        System.out.println("Bytes: 4");
        System.out.println("Minimum value: " + Float.MIN_VALUE);
        System.out.println("Maximum value: " + Float.MAX_VALUE);
        System.out.println("Example declaration: float exampleFloat = 3.14f;");
        System.out.println("Scientific notation example: float scientificFloat = 1.23e2f;");
        System.out.println("Scientific value result: " + scientificFloat);
        System.out.println("----------------------------------");


        // ===============================
        // 6. double
        // ===============================
        double exampleDouble = 3.1415926535;
        double scientificDouble = 2.5e3;         // 2.5 × 10^3 = 2500.0

        System.out.println("Type: double");
        System.out.println("Bits: 64");
        System.out.println("Bytes: 8");
        System.out.println("Minimum value: " + Double.MIN_VALUE);
        System.out.println("Maximum value: " + Double.MAX_VALUE);
        System.out.println("Example declaration: double exampleDouble = 3.1415926535;");
        System.out.println("Scientific notation example: double scientificDouble = 2.5e3;");
        System.out.println("Scientific value result: " + scientificDouble);
        System.out.println("----------------------------------");


        // ===============================
        // 7. char (multiple declaration ways)
        // ===============================

        char directChar = 'A';           // Direct character
        char unicodeChar = '\u0041';     // Unicode representation
        char decimalChar = 65;           // Decimal Unicode value
        char newlineChar = '\n';         // Escape sequence

        System.out.println("Type: char");
        System.out.println("Bits: 16");
        System.out.println("Bytes: 2");
        System.out.println("Minimum value (Unicode): " + (int) Character.MIN_VALUE);
        System.out.println("Maximum value (Unicode): " + (int) Character.MAX_VALUE);
        System.out.println("Direct declaration: char directChar = 'A'; -> " + directChar);
        System.out.println("Unicode declaration: char unicodeChar = '\\u0041'; -> " + unicodeChar);
        System.out.println("Decimal declaration: char decimalChar = 65; -> " + decimalChar);
        System.out.println("Escape sequence example (newline): '\\n'");
        System.out.println("----------------------------------");
        


        // ===============================
        // 8. boolean
        // ===============================
        boolean exampleBoolean = true;

        System.out.println("Type: boolean");
        System.out.println("Bits: JVM dependent (logical true/false)");
        System.out.println("Bytes: Not precisely defined");
        System.out.println("Possible values: true / false");
        System.out.println("Example declaration: boolean exampleBoolean = true;");
        System.out.println("----------------------------------");

	}

}
