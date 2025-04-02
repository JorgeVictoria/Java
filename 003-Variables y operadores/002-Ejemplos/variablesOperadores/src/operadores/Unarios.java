package operadores;

public class Unarios {

    public static void main(String[] args) {

        int x = 10;
        int y = 7;
        int z = 2;

        //inverso negativo
        x = -x;
        System.out.println("x = " + x);

        //preIncremento
        x = ++y + 2;
        System.out.println("preIncremento");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        //postIncremento
        x = y++ + 2;
        System.out.println("postIncremento");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
