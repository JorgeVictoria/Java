package string;

public class Concatenacion {

    public static void main(String[] args) {

        //Los objetos String son inmutables
        //Si modificamos una variable, se devuelve una nueva instancia
        String cadena1 = "Curso";
        String cadena2 = "Java";
        String detalle = cadena1 + " de " + cadena2;
        System.out.println("detalle = " + detalle);

        //Uso del método concat
        String detalle2 = cadena1.concat(" de ").concat(cadena2);
        System.out.println("detalle2 = " + detalle2);

        int numA = 10;
        int numB = 5;

        //Hay que tener cuidado con la precedencia de los operadores cuando tengamos que concatenar
        System.out.println(detalle + numA + numB);
        System.out.println(detalle + (numA + numB));

    }
}
