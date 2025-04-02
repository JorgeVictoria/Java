package operadores;

public class Asignacion {

    public static void main(String[] args) {
        
        int x = 10;
        
        //suma. Es lo mismo que x = x + 1
        x+=1;
        System.out.println("x = " + x);
        
        //resta
        x-=1;
        System.out.println("x = " + x);
        
        //producto
        x*=2;
        System.out.println("x = " + x);
        
        //división
        x/=5;
        System.out.println("x = " + x);
        
        //resto
        x%=3;
        System.out.println("x = " + x);
    }
}
