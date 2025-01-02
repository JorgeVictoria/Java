package string;

public class Inmutabilidad {

    public static void main(String[] args) {

        String cadena1 = "Curso";
        String cadena2 = " Java";

        //Los objetos String son inmutables
        cadena1.concat(cadena2);
        System.out.println("cadena1 = " + cadena1);

        cadena1.transform(c -> {
            return c.concat(cadena2);
        });
        System.out.println("cadena1 = " + cadena1);

        cadena2.replace("a", "o");
        System.out.println("cadena1 = " + cadena1);

        //Creamos una nueva instancia de objeto String
        String detalle = cadena1.concat(cadena2);
        System.out.println("detalle = " + detalle);

        String detalle2 = cadena1.transform(c -> {
            return c.concat(cadena2);
        });
        System.out.println("detalle2 = " + detalle2);

        String detalle3 = detalle.replace("a", "o");
        System.out.println("detalle3 = " + detalle3);

    }
}
