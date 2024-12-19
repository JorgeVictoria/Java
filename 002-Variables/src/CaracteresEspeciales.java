public class CaracteresEspeciales {
    public static void main(String[] args) {

        //espacio
        char espacio = ' ';
        System.out.println("Una" + espacio + "cadena");

        //retroceso
        char retroceso = '\b';
        System.out.println("Una cadena" + retroceso);

        //tabulador
        char tabulador = '\t';
        System.out.println("Una gran" + tabulador + "cadena");

        //nueva linea
        char nuevaLinea = '\n';
        System.out.println("Una" + nuevaLinea + "cadena");

        //retorno de carro
        char retornoCarro = '\r';
        System.out.println("una" + retornoCarro + "cadena");

        //Uso de variables predeterminadas de System
        System.out.println("una" + System.lineSeparator() + "cadena");

    }
}
