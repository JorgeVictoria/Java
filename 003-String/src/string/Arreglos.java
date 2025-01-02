package string;

public class Arreglos {

    public static void main(String[] args) {

        String trabalenguas = "Trabalenguas";

        //Al imprimir el array, nos devuelve la dirección del objeto
        System.out.println("trabalenguas.toCharArray = " + trabalenguas.toCharArray());
        
        //creamos el array
        char[] arreglo = trabalenguas.toCharArray();

        //obtenemos la cantidad de caracteres
        int largo = arreglo.length;

        //correr el arreglo
        for (int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }

        //Separar una cadena en trozos. La cadena del patrón se ignora
        String[] trozos = trabalenguas.split("a");
        largo = trozos.length;

        //correr el arreglo
        System.out.println();
        for (int i = 0; i < largo; i++){
            System.out.println(trozos[i]);
        }

        //Para obtener la extension de un archivo
        String archivo = "imagen.jpg";
        String[] subcadena = archivo.split("\\.");
        String extension = subcadena[subcadena.length-1];
        System.out.println("extension = " + extension);

    }
}
