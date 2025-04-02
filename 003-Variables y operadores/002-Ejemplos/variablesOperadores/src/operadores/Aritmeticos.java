package operadores;

public class Aritmeticos {

    public static void main(String[] args) {

        int x = 7;
        int y = 5;

        //Suma
        System.out.printf("%d + %d = %d%n",x,y,x+y);

        //resta
        System.out.printf("%d - %d = %d%n",x,y,x-y);

        //producto
        System.out.printf("%d * %d = %d%n",x,y,x*y);

        //división entera
        System.out.printf("%d : %d = %d%n",x,y,x/y);

        //división decimal
        System.out.printf("%d : %d = %.2f%n",x,y,(double)x/y);

        //resto de la división
        System.out.printf("%d : %d = %d%n",x,y,x%y);
    }
}
