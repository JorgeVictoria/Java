package variables;

public class Inferencia {

    public static void main(String[] args) {

        // Inferencia de tipos con 'var'
        // inferido como int
        var numero = 42;
        // inferido como long
        var numeroGrande = 42L;
        // inferido como double
        var pi = 3.14159;
        // inferido como String
        var mensaje = "Hola!";
        // inferido como boolean
        var activo = true;
        // inferido como char
        var letra = 'A';

        // Mostrar los valores inferidos
        System.out.println("numero (int): " + numero);
        System.out.println("numeroGrande (long): " + numeroGrande);
        System.out.println("pi (double): " + pi);
        System.out.println("mensaje (String): " + mensaje);
        System.out.println("activo (boolean): " + activo);
        System.out.println("letra (char): " + letra);

    }
}
