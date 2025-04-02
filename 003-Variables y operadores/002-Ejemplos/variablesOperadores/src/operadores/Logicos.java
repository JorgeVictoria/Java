package operadores;

import java.util.Random;

public class Logicos {

    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(100);

        //AND lògico
        System.out.println(x + " >= 18 y <=65 -> " + (x >= 18 && x <= 65));

        //OR lògico
        System.out.println(x + " >= 18 o <=65 -> " + (x <= 18 || x >= 65));

        //Negación lógica
        System.out.println(x + " >= 18 o <=65 -> " + !(x <= 18 || x >= 65));

    }
}
