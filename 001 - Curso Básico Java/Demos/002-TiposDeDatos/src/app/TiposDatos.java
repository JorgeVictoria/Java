package app;

public class TiposDatos {

    public static void main(String[] args) {

        //Byte
        byte muyCorto = 5;
        System.out.println("muyCorto = " + muyCorto);

        //Short
        short corto = 2024;
        System.out.println("corto = " + corto);

        //Integer
        int entero = 123456789;
        System.out.println("entero = " + entero);

        //Long
        long largo = 1234567890123456789L;
        System.out.println("largo = " + largo);
        long creditCard = 1312_1111_2222_2456L;
        System.out.println("creditCard = " + creditCard);

        //Float
        float decimalCorto = 3.1425F;
        System.out.println("decimalCorto = " + decimalCorto);

        //Double
        double decimalLargo = 3.1415;
        System.out.println("decimalLargo = " + decimalLargo);
        double notacionCientificaA = 1.2345E-2;
        System.out.println("notacionCientificaA = " + notacionCientificaA);
        double notacionCientificaB = 1.2345E6;
        System.out.println("notacionCientificaB = " + notacionCientificaB);

        //Boolean
        boolean booleano = true;
        System.out.println("booleano = " + booleano);

        //Char
        char caracter = 'c';
        System.out.println("caracter = " + caracter);
        char caracterNumerico = 67;
        System.out.println("caracterNumerico = " + caracterNumerico);

        //Objeto
        String msg = "Hola Mundo";
        System.out.println("msg = " + msg);


    }
}
