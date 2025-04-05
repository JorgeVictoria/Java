package iterativas;

import java.util.Random;

public class BucleFor {

    public static void main(String[] args) {

        //Bucle for normal incremental
        for(int i = 1; i <=5 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Bucle for normal decremental
        for(int i = 5; i >=1 ; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //Otro ejemplo
        for(int i = 0; i <=100 ; i+=5){
            System.out.print(i + " ");
        }

        System.out.println();

        //sentencia break con cálculo de número primo
        Random random = new Random();
        int num = random.nextInt(0, 1000);
        boolean esPrimo = true;
        System.out.println("num = " + num);
        for(int i = 2; i <num ; i++){
            if(num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println("esPrimo = " + esPrimo);

        System.out.println();

        //sentencia continue, ejemplo sumando solo números pares
        int suma = 0;
        for(int i = 0; i <= 10 ; i++){
            if(i % 2 != 0) {
                continue;
            }
            suma += i;
        }
        System.out.println("suma = " + suma);
    }
}
