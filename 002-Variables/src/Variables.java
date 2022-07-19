import java.util.Locale;

public class Variables {

    public static void main(String[] args) {

        //variables locales. Declaración e inicialización
        String saludo = "Hola mundo desde Java";
        int numero = 10;
        boolean valor = true;
        var algo = "15";

        //impresion por pantalla. sout
        System.out.println(saludo);

        //impresion por pantalla. soutv (ultima variable)
        System.out.println("saludo = " + saludo.toUpperCase());

        //ejemplo de contexto de valores. Puedo usar las variables del padre, pero no puedo usar las declaradas dentro
        if(valor){
            System.out.println("numero = " + numero);
            int numero2 = 20;
        }

        //error, no puedo usar la variable declarada en el bloque anterior
        //System.out.println("numero2 = " + numero2);

        //imprimimos el valor del tipo var
        System.out.println("algo = " + algo);
    }
}
