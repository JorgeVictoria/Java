package arrays;

public class DeclaracionArray {

    public static void main(String[] args) {

        //sintaxis clásica
        int[] arr1 = new int[10];

        //con inferencia
        var arr2 = new double[10];

        //Inicialización clásica
        String[] arr3 = new String[]{"Hola", "Mundo"};

        //Inicialización abreviada
        String[] arr4 = {"Hola", "mundo"};

        //Inicialización con var
        var arr5 = new String[]{"Hola","mundo"};

        //acceder a una posición del array
        System.out.println(arr5[1]);
        arr1[0] = 2;
        System.out.println(arr1[0]);
    }
}
