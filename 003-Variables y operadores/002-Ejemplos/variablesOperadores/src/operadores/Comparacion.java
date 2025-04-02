package operadores;

import java.util.Random;

public class Comparacion {

    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);

        System.out.println(x + " > " + y + " = " + (x>y));
        System.out.println(x + " >= " + y + " = " + (x>=y));
        System.out.println(x + " < " + y + " = " + (x<y));
        System.out.println(x + " <= " + y + " = " + (x<=y));
        System.out.println(x + " == " + y + " = " + (x==y));
        System.out.println(x + " != " + y + " = " + (x!=y));
    }
}
