public class NumericosReales {

    public static void main(String[] args) {

        //tipo float
        System.out.println("Tipo Float");
        System.out.println("------------");
        float realFloat = 7f;
        float realFloatDecimal = 7.0f;
        float realFloatExponente = 2.12e3f;
        float realFloatNegativo = 2.12e-3f;
        float real = 0.000000015f;
        System.out.println("Min. float = " + Float.MIN_VALUE);
        System.out.println("Max. float = " + Float.MAX_VALUE);
        System.out.println("Num. bites = " + Float.BYTES);
        System.out.println("Num. bits = " + Float.SIZE);
        System.out.println("Min. exp = " + Float.MIN_EXPONENT);
        System.out.println("Max. exp = " + Float.MAX_EXPONENT);
        System.out.println();

        //tipo double
        System.out.println("Tipo Double");
        System.out.println("------------");
        double realDouble = 7;
        System.out.println("Min. double = " + Double.MIN_VALUE);
        System.out.println("Max. double = " + Double.MAX_VALUE);
        System.out.println("Num. bites = " + Double.BYTES);
        System.out.println("Num. bits = " + Double.SIZE);
        System.out.println("Min. exp = " + Double.MIN_EXPONENT);
        System.out.println("Max. exp = " + Double.MAX_EXPONENT);
        System.out.println();

        //impresion por pantalla de numeros
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloatDecimal = " + realFloatDecimal);
        System.out.println("realFloatExponente = " + realFloatExponente) ;
        System.out.println("realFloatNegativo = " + realFloatNegativo);
        System.out.printf("realLargo = %e", real);     //numero en formato exponencial

    }
}
