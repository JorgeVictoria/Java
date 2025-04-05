package iterativas;

import java.util.Random;

public class BucleDoWhile {

    public static void main(String[] args) {

        Random random = new Random();
        int num;

        //imprimir números mientras hasta encontrar el primer número divisible por 5
        do{
            num = random.nextInt(1, 10);
            System.out.print(num + " ");
        } while (num % 5 != 0);
    }
}
