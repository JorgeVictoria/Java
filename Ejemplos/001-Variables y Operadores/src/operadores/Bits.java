package operadores;

public class Bits {

    public static void main(String[] args) {

        // en binario: 0110
        int a = 6;
        // en binario: 0011
        int b = 3;

        System.out.println("a = " + a + " (binario 0110)");
        System.out.println("b = " + b + " (binario 0011)");

        // AND bit a bit. 0010 = 2
        System.out.println("a & b = " + (a & b));

        // OR bit a bit. 0111 = 7
        System.out.println("a | b = " + (a | b));

        // XOR bit a bit. 0101 = 5
        System.out.println("a ^ b = " + (a ^ b));

        // NOT bit a bit. complemento de 6
        System.out.println("~a = " + (~a));

        // Desplazamiento a la izquierda. 1100 = 12
        System.out.println("a << 1 = " + (a << 1));

        // Desplazamiento a la derecha con signo. 0011 = 3
        System.out.println("a >> 1 = " + (a >> 1));

        // Desplazamiento a la derecha sin signo
        int negativo = -6;
        System.out.println("negativo = " + negativo);
        System.out.println("negativo >> 1 = " + (negativo >> 1));
        System.out.println("negativo >>> 1 = " + (negativo >>> 1));
    }
}
