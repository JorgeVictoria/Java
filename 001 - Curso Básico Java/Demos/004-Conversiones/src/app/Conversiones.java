package app;

public class Conversiones {

    public static void main(String[] args) {
        
        //sin perdida de datos
        System.out.println("Conversión de short -> int");
        short s1 = 12345;
        System.out.println("s1 = " + s1);
        int i1 = s1;
        System.out.println("i1 = " + i1);
        
        //con posible perdida de datos
        System.out.println("Conversión de long -> float");
        long l1 = 1234567890123456789L;
        System.out.println("l1 = " + l1);
        float f1 = l1;
        System.out.println("f1 = " + f1);
        System.out.printf("%.2f",f1);
        System.out.println();

        System.out.println("Conversión de long -> double");
        System.out.println("l1 = " + l1);
        double d1 = l1;
        System.out.println("d1 = " + d1);
        System.out.printf("%.2f",d1);
        System.out.println();

        System.out.println("Conversión de int -> float");
        int big = 1234567890;
        System.out.println("big = " + big);
        float f2 = big;
        System.out.println("f2 = " + f2);
        System.out.println(big - (int)f2);
        
        //Conversiones explícitas
        System.out.println("Conversión de int -> short");
        int i2 = 1234;
        System.out.println("i2 = " + i2);
        short s2 = (short) i2;
        System.out.println("s2 = " + s2);

        System.out.println("Conversión de double -> float");
        double d2 = 3.141516;
        System.out.println("d2 = " + d2);
        float f3 = (float) d2;
        System.out.println("f3 = " + f3);
    }
}
