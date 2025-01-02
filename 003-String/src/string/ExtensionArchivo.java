package string;

public class ExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "imagen.jpg";
        
        //obtener la cadena desde el último punto
        String extension = archivo.substring(archivo.lastIndexOf(".")+1);
        System.out.println("extension = " + extension);
    }
}
