package variables;

public class EjemploVariables {
    public static void main(String[] args) {

        //Declarar e inicializar en la misma linea
        String msg = "Hola mundo";
        System.out.println("msg = " + msg);

        //Declarar e inicializar en diferentes lineas
        int x;
        x = 7;
        System.out.println("x = " + x);

        //Reasignar un nuevo valor
        msg = "Hasta luego";
        System.out.println("msg = " + msg);
    }
}
