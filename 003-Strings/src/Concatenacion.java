public class Concatenacion {

    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andrés Guzmán.";

        String detalle = curso + " con el profesor " + profesor;
        System.out.println(detalle);

        int numA = 10;
        int numB = 5;

        //concatena los numeros por la precedencia de los operadores
        System.out.println(detalle +  numA + numB);
        //podemos usar parentesis para cambiar la precedenicia
        System.out.println(detalle + (numA + numB));
        //se puede cambiar el orden de los factores y su precedencia
        System.out.println(numA + numB + detalle);

        //concatenar con concat
        String detalle2 = curso.concat(": ").concat(profesor);
        System.out.println(detalle2);
    }
}
