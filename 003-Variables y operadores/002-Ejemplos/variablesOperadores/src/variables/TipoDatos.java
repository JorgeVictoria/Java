package variables;

public class TipoDatos {

    public static void main(String[] args) {

        //tipo byte
        byte tipoByte = 1;
        System.out.println("tipoByte = " + tipoByte);
        
        //tipo short
        short tipoShort = 2;
        System.out.println("tipoShort = " + tipoShort);
        
        //tipo int
        int tipoInt = 100;
        System.out.println("tipoInt = " + tipoInt);
        
        //tipo long
        long tipoLong = 10000000000L;
        System.out.println("tipoLong = " + tipoLong);
        long tarjetaCredito = 123_456_789_012L;
        System.out.println("tarjetaCredito = " + tarjetaCredito);

        //tipo float
        float tipoFloat = 100.23F;
        System.out.println("tipoFloat = " + tipoFloat);
        float notacionCientifica = 10023E-2F;
        System.out.println("notacionCientifica = " + notacionCientifica);
        
        //tipo double
        double tipoDouble = 100.23;
        System.out.println("tipoDouble = " + tipoDouble);
        
        //tipo char
        char caracter = 69;
        System.out.println("caracter = " + caracter);
        char letra = 'E';
        System.out.println("letra = " + letra);
        
        //tipo booleano
        boolean verdadero = true;
        System.out.println("verdadero = " + verdadero);
        boolean falso = false;
        System.out.println("falso = " + falso);
        
        //Tipo no primitivo String
        String cadena = "Hola mundo";
        System.out.println("cadena = " + cadena);

    }
}
