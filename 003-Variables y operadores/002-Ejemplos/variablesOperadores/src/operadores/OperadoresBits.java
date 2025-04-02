package operadores;

public class OperadoresBits {

    public static void main(String[] args) {

        final String CADENA = "%s%n%n";

        int x = 48;
        System.out.println("x = " + x);
        System.out.printf(CADENA, Integer.toBinaryString(x));


        //desplazamiento de bits a la derecha
        int y = x>>1;
        System.out.println("desplazamiento de bits a la derecha");
        System.out.println("y = " + y);
        System.out.printf(CADENA, Integer.toBinaryString(y));

        //desplazamiento de bits a la izquierda
        y = x<<1;
        System.out.println("desplazamiento de bits a la derecha");
        System.out.println("y = " + y);
        System.out.printf(CADENA, Integer.toBinaryString(y));

        //desplazamiento de bits a la derecha sin signo
        x = -48;
        y = x>>>1;
        System.out.println("desplazamiento de bits a la derecha sin signo");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.printf(CADENA, Integer.toBinaryString(y));

        //Otros operadores
        x = 24;
        y = 20;
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println("operador AND");
        System.out.println("x & y = " + Integer.toBinaryString(x&y));
        System.out.println("operador OR");
        System.out.println("x & y = " + Integer.toBinaryString(x|y));
        System.out.println("operador NOT");
        System.out.println("~ y = " + Integer.toBinaryString(~y));
        System.out.println("operador XOR");
        System.out.println("x ^ y = " + Integer.toBinaryString(x^y));

    }
}
