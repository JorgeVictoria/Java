package condicionales;

public class EstructuraIfElse {

    public static void main(String[] args) {

        int nota = 4;

        //Estructura if-else sencillo
        if(nota>5){
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspendido");
        }

        //podemos utilizar solo if, sin else
        float precio = 12.34f;
        float iva = 0.21f;

        if (iva > 0) {
            precio += precio*iva;
        }

        System.out.println("precio = " + precio);

        //condiciones más complejas
        int edad = 77;
        final int EDAD_MINIMA_TRABAJO = 16;
        final int EDAD_MAXIMA_TRABAJO = 67;

        if(edad < EDAD_MINIMA_TRABAJO) {
            System.out.println("Demasiado joven para trabajar");
        } else if (edad > EDAD_MAXIMA_TRABAJO) {
            System.out.println("Se puede jubilar");
        } else {
            System.out.println("Puede trabajar");
        }

        //en estructuras con una sola sentencia no son necesarias las llaves
        if(nota>5) System.out.println("Aprobado");
        else System.out.println("Suspendido");
    }
}
