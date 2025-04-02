package variables;

public class Casting {

    public static void main(String[] args) {
        
        //Conversión sin perdida de información. De menor a mayor tipo de datos
        int x = 1000000;
        System.out.println("x = " + x);
        long y = x;
        System.out.println("y = " + y);

        //Perdida de información
        long numLong = 123_456_789_123_456L;
        System.out.println("Conversion de long a float");
        System.out.println("numLong = " + numLong);
        float numFloat = numLong;
        System.out.printf("%.2f", numFloat);
        System.out.println();

        //Perdida de decimales
        double numDouble = 31.76;
        System.out.println("numDouble = " + numDouble);
        int numInt = (int) numDouble;
        System.out.println("numInt = " + numInt);

        //Conversion errónea
        int entero = 12345678;
        System.out.println("entero = " + entero);
        byte numByte = (byte) entero;
        System.out.println("numByte = " + numByte);
    }
}
