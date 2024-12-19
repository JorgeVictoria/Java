public class PrimitivosFlotantes {
    public static double unValor;
    public static void main(String[] args) {
        //Tipo float
        System.out.println("Tipo Float");
        float numeroFloat = 3.1416F;
        float floatPositivo = 2.12e3F;
        float floatNegativo = 2.12e-3F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo = " + Float.MIN_VALUE);
        System.out.println("Valor máximo = " + Float.MAX_VALUE);
        System.out.println("Nº de bits = " + Float.SIZE);
        System.out.println("Nº de bytes = " + Float.BYTES);
        System.out.println("floatPositivo = " + floatPositivo);
        System.out.println("floatNegativo = " + floatNegativo);
        System.out.println();

        //Tipo double
        System.out.println("Tipo Double");
        double numeroDouble = 3.1416;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo = " + Double.MIN_VALUE);
        System.out.println("Valor máximo = " + Double.MAX_VALUE);
        System.out.println("Nº de bits = " + Double.SIZE);
        System.out.println("Nº de bytes = " + Double.BYTES);
        System.out.println();

        //Tipo var
        var varFlotante = 3.1415;
        System.out.println("varFlotante = " + varFlotante);

        //Las variables de clase tienen un valor por defecto, no necesitan ser inicializadas
        System.out.println("unValor = " + unValor);
    }
}
