package iterativas;

import java.util.Random;

public class BucleWhile {

    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(0,100);
        int contador = 2;
        boolean esPrimo = true;

        System.out.println("num = " + num);

        while (esPrimo && contador < num){
            if(num % contador != 0){
                contador++;
            } else {
                esPrimo = false;
            }
        }

        System.out.println("esPrimo = " + esPrimo);
    }
}
