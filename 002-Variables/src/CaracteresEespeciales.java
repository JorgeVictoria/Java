public class CaracteresEespeciales {

    public static void main(String[] args) {

        char espacio = ' ';
        espacio = '\u0020';

        //borra un caracter
        char retroceso = '\b';

        //tabulador
        char tabulador = '\t';

        //nueva linea
        char nuevaLinea = '\n';

        //retroceso Carro
        char retrocesoCarro = '\r';

        System.out.println("hola" + espacio + "Jorge");
        System.out.println("hola" + retroceso + "Jorge");
        System.out.println("hola" + tabulador + "Jorge");
        //los caracteres especiales se pueden usar dentro de la cadena
        System.out.println("hola\tJorge");
        System.out.println("hola" + nuevaLinea + "Jorge");
        //borra lo que haya antes
        System.out.println("hola" + retrocesoCarro + "Jorge");
        //igual que el salto de linea
        System.out.println("hola" + System.lineSeparator() + "Jorge");
    }
}
