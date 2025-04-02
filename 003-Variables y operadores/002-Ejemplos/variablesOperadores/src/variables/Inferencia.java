package variables;

public class Inferencia {

    public static void main(String[] args) {

        //variable de diferentes tipos sin tomar el tipo
        var cadena = "Hola mundo";
        System.out.println("cadena = " + cadena);
        
        //para valores enteros, int por defecto
        var x = 7;
        System.out.println("x = " + x);
        
        //para valores decimales, double por defecto
        var decimal = 3.1415;
        System.out.println("decimal = " + decimal);
    }
}
