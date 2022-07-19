public class Casting {

    public static void main(String[] args) {

        //de string a enteros
        String numero = "50";
        int numeroInt = Integer.parseInt(numero);
        byte numeroByte = Byte.parseByte(numero);
        short numeroShort = Short.parseShort(numero);
        long numeroLong = Long.parseLong(numero);
        System.out.println("numeroInt = " + numeroInt);

        //de string a reales
        String numeroReal = "98765.43";
        String numeroCientifico = "98765.43e-3";
        double numeroDouble = Double.parseDouble(numeroReal);
        double numDouble = Double.parseDouble(numeroCientifico);
        float numeroFloat = Float.parseFloat(numeroReal);
        float numFloat = Float.parseFloat(numeroCientifico);
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("numFloat = " + numFloat);

        //de string a boolean
        String booleano = "true";
        boolean logico = Boolean.parseBoolean(booleano);

        //De enteros a String
        String otroNumero = Integer.toString(numeroInt);
        otroNumero = String.valueOf(numeroInt);
        System.out.println("otroNumero = " + otroNumero);
        //podemos aprovechar para crear una expresiona
        otroNumero = String.valueOf(numeroInt + 10);
        System.out.println("otroNumero = " + otroNumero);

        //de realea a String
        otroNumero = String.valueOf(numeroDouble);
        System.out.println("otroNumero = " + otroNumero);
        otroNumero = String.valueOf(numFloat);
        System.out.println("otroNumero = " + otroNumero);
        //imprimir en notacion cientifica
        System.out.printf("numFloat =  %e", numeroFloat);
        System.out.println();
        
        //de primitivos a primitivos. Cuidado que haya compatibilidad por tamaño de bytes
        int i = 100;
        byte b = (byte)i;
        System.out.println("b = " + b);
        short s = (short)i;
        System.out.println("s = " + s);
        long l = (long)i;
        System.out.println("l = " + l);
        //no se puede convertir de entero a boolean
        //boolean booleano = (boolean) i; 
        //los caracteres imprimiran el valor de la tabla ASCII
        char c = (char)i;
        System.out.println("c = " + c);
        //paso a reales
        float f = (float) i;
        System.out.println("f = " + f);
        double d = (double) i;
        System.out.println("d = " + d);
    }
}
