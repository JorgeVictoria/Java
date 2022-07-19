public class ObtenerExtension {

    public static void main(String[] args) {
        
        String documento = "alta_domicializacion.pdf";
        System.out.println("documento.length() = " + documento.length());

        //capturamos la posicion del punto
        int pos = documento.lastIndexOf(".");
        System.out.println("pos = " + pos);

        //cogemos la parte que indica la extension del fichero
        String extension = documento.substring(pos+1);
        System.out.println("extension = " + extension);
    }
}
