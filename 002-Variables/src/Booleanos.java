public class Booleanos {

    public static void main(String[] args) {

        boolean verdadero = true;
        boolean falso = false;

        System.out.println("verdadero = " + verdadero);
        System.out.println("falso = " + falso);

        //uso de los wrappers
        verdadero = Boolean.TRUE;
        falso = Boolean.FALSE;

        System.out.println("verdadero = " + verdadero);
        System.out.println("falso = " + falso);

        //se suele usar para flujos de control, comparaciones...
        double d = 98765.43e-3;
        float f = 1.2345e2f;

        boolean datoLogico = d < f;
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);

    }
}
