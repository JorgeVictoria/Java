public class SistemasNumericos {

    public static void main(String[] args) {

        //variable inicial
        int edad = 46;
        System.out.println("edad = " + edad);

        //conversion a binario
        System.out.println("Binario edad = " + Integer.toBinaryString(edad));
        
        //representacion literal de un binario, aunque al imprimirlo saldrá en formato decimal
        int edadBinario = 0b101110;
        System.out.println("edadBinario = " + edadBinario);

        //conversion a octal
        System.out.println("Octal edad = " + Integer.toOctalString(edad));

        //representacion literal de un binario, aunque al imprimirlo saldrá en formato decimal
        int edadOctal = 056;
        System.out.println("edadOctal = " + edadOctal);

        //conversion a hexadecimal
        System.out.println("Hexadecimal edad = " + Integer.toHexString(edad));

        //representacion literal de un binario, aunque al imprimirlo saldrá en formato decimal
        int edadHexadecimal = 0x2e;
        System.out.println("edadHexadecimal = " + edadHexadecimal);

    }
}
