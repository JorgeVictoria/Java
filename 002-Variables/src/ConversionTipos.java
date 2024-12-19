public class ConversionTipos {
    public static void main(String[] args) {

        //String a primitivo
        String cadenaA = "50";
        int numeroA = Integer.parseInt(cadenaA);
        System.out.println("cadenaA = " + cadenaA);
        System.out.println("numeroA = " + numeroA);
        System.out.println();

        String cadenaB = "3.1416";
        String cadenaC = "3.1416e2";
        float numeroB = Float.parseFloat(cadenaB);
        float numeroC = Float.parseFloat(cadenaC);
        System.out.println("cadenaB = " + cadenaB);
        System.out.println("cadenaC = " + cadenaC);
        System.out.println("numeroB = " + numeroB);
        System.out.println("numeroC = " + numeroC);
        System.out.println();

        String cadenaD = "true";
        Boolean booleanoA = Boolean.parseBoolean(cadenaD);
        System.out.println("cadenaD = " + cadenaD);
        System.out.println("booleanoA = " + booleanoA);
        System.out.println();

        var cadenaE = "1202";
        var numeroD = Integer.parseInt(cadenaE);
        System.out.println("cadenaE = " + cadenaE);
        System.out.println("numeroD = " + numeroD);
        System.out.println();

        //Primitivo a String
        int numA = 600;
        String cadA = Integer.toString(numA);
        String cadB = String.valueOf(numA);
        //suma
        String cadC = String.valueOf(numA+10);
        //concatenación
        String cadD = String.valueOf(cadA+10);
        System.out.println("numA = " + numA);
        System.out.println("cadA = " + cadA);
        System.out.println("cadB = " + cadB);
        System.out.println("cadC = " + cadC);
        System.out.println("cadD = " + cadD);

        double real = 1.2546;
        double cient = 1.2546e2;
        String cadE = String.valueOf(real);
        String cadF = String.valueOf(cient);
        System.out.println("real = " + real);
        System.out.println("cient = " + cient);
        System.out.println("cadE = " + cadE);
        System.out.println("cadF = " + cadF);
        System.out.println();

        //primitivo a primitivo. Posible perdida de datos
        int primA = 100000;
        short primB = (short) primA;
        long primC = primA;
        System.out.println("primA = " + primA);
        System.out.println("primB = " + primB);
        System.out.println("primC = " + primC);
        float primD = 3.1416f;
        int primE = (int) primD;
        System.out.println();

        System.out.println("primD = " + primD);
        System.out.println("primE = " + primE);

    }
}
