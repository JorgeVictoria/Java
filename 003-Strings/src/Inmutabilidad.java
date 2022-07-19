public class Inmutabilidad {

    public static void main(String[] args) {

        //variables originales
        String curso = "Programacion Java";
        String profesor = "Andrés Guzmán.";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        curso.transform(c ->{
            return c + " con " + profesor;
        });

        //a pesar del transform, no se inmuta
        System.out.println("curso = " + curso);

        //podemos crear una nueva referencia
        String resultado2 = curso.transform(c ->{
            return c + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);

        resultado.replace("a", "A");
        //a pesar del replace, no se inmuta
        System.out.println("resultado = " + resultado);

        //podemos crear una nueva referencia
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);

    }
}
