public class PrimitivosEnteros {
    public static void main(String[] args) {

        //Tipo byte
        System.out.println("Tipo Byte");
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor mínimo = " + Byte.MIN_VALUE);
        System.out.println("Valor máximo = " + Byte.MAX_VALUE);
        System.out.println("Nº de bits = " + Byte.SIZE);
        System.out.println("Nº de bytes = " + Byte.BYTES);
        System.out.println();

        //Tipo short
        System.out.println("Tipo Short");
        short numeroShort = 7;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor mínimo = " + Short.MIN_VALUE);
        System.out.println("Valor máximo = " + Short.MAX_VALUE);
        System.out.println("Nº de bits = " + Short.SIZE);
        System.out.println("Nº de bytes = " + Short.BYTES);
        System.out.println();

        //Tipo int
        System.out.println("Tipo Int");
        int numeroInt = 7;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor mínimo = " + Integer.MIN_VALUE);
        System.out.println("Valor máximo = " + Integer.MAX_VALUE);
        System.out.println("Nº de bits = " + Integer.SIZE);
        System.out.println("Nº de bytes = " + Integer.BYTES);
        System.out.println();

        //Tipo long
        System.out.println("Tipo Long");
        long numeroLong = 7L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor mínimo = " + Long.MIN_VALUE);
        System.out.println("Valor máximo = " + Long.MAX_VALUE);
        System.out.println("Nº de bits = " + Long.SIZE);
        System.out.println("Nº de bytes = " + Long.BYTES);
        System.out.println();

        //tipo var. Por defecto solo será int o long
        var numeroVar = 127L;
        System.out.println("numeroVar = " + numeroVar);
    }
}
