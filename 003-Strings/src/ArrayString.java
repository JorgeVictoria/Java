public class ArrayString {

    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        //construimos un array
        char[] letras = trabalenguas.toCharArray();
        int longitud = letras.length;

        //corremos el array
        for(int i = 0; i < longitud; i++){
            System.out.println("letras[" + i + "] = " + letras[i]);
        }

        //crear un array con un patron separador
        String[] trozos = trabalenguas.split("a");

        //corremos el array
        for(int i = 0; i < trozos.length; i++){
            System.out.println("trozos[" + i + "] = " + trozos[i]);
        }

        //para obtener la extension de un fichero
        String fichero = "nombre_fichero.pdf";
        String[] archivo = fichero.split("\\.");
        //solo tenemos que coger el ultimo trozo
        System.out.println("extension: " + archivo[archivo.length-1]);
    }
}
