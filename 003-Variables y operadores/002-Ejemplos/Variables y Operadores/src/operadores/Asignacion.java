package operadores;

public class Asignacion {

    public static void main(String[] args) {

        int a = 10;

        System.out.println("Valor inicial de a: " + a);

        // a = a + 5
        a += 5;
        System.out.println("Después de a += 5: " + a);

        // a = a - 3
        a -= 3;
        System.out.println("Después de a -= 3: " + a);

        // a = a * 2
        a *= 2;
        System.out.println("Después de a *= 2: " + a);

        // a = a / 4
        a /= 4;
        System.out.println("Después de a /= 4: " + a);

        // a = a % 3
        a %= 3;
        System.out.println("Después de a %= 3: " + a);
    }
}
