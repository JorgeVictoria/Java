package string;

public class Validacion {

    public static void main(String[] args) {

        String curso = null;

        //comprobar si es nulo
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        //comprobar si es cadena vacía
        curso = "";
        boolean esVacia = curso.isEmpty();
        System.out.println("esVacia = " + esVacia);

        //comprobar si no tiene caracteres. También se puede utilizar con cadenas vacías
        curso = " ";
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

    }
}
