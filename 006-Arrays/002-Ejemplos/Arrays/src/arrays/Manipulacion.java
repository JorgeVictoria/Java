package arrays;

public class Manipulacion {

    public static void main(String[] args) {

        //inicialización
        int[] numeros = {0,1,2,3,4,5,6,7,8,9};
        int[] otro = new int[2];

        //tamaño
        System.out.println(numeros.length);

        //correr un array
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();

        for(int i = 0; i<otro.length; i++){
            otro[i]=i;
        }

        //clonar un array
        var arr2 = otro.clone();

        for (int numero : arr2) {
            System.out.print(numero + " ");
        }

        //Todo ver clase Arrays


    }
}
