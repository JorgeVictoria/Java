public class Caracteres {

    public static void main(String[] args) {

        //tipo char
        System.out.println("Tipo Char");
        System.out.println("------------");
        System.out.println("Min. char = " + Character.MIN_VALUE);
        System.out.println("Max. char = " + Character.MAX_VALUE);
        System.out.println("Num. bites = " + Character.BYTES);
        System.out.println("Num. bits = " + Character.SIZE);
        System.out.println();


        //declaracion e inicializacion de variables
        char caracter = 'A';
        System.out.println("caracter = " + caracter);

        char numero = '9';
        System.out.println("numero = " + numero);
        
        //usando secuencia de escape
        char unicode = '\u0040';
        System.out.println("unicode = " + unicode);
        
        //usando decimal
        char decimal = 64;
        System.out.println("decimal = " + decimal);

        //usando un valor literal
        char simbolo = '@';

        //comparamos para ver que los tres tipos representan el mismo valor
        System.out.println("unicode = decimal is " + (unicode == decimal));
        System.out.println("simbolo = decimal is " + (simbolo == decimal));
        System.out.println("unicode = simbolo is " + (unicode == simbolo));

        System.out.println("");




    }
}
