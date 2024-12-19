public class SistemasNumericos {
    public static void main(String[] args) {

        int numero = 500;

        //decimal
        System.out.println("decimal = " + numero);

        //binario
        System.out.println("binario = " + Integer.toBinaryString(numero));
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //octal
        System.out.println("octal = " + Integer.toOctalString(numero));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //hexadecimal
        System.out.println("hexadecimal = " + Integer.toHexString(numero));
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
    }
}
