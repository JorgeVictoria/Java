public class Validacion {

    public static void main(String[] args) {

        String curso = null;

        //para ver si una cadena tiene valor null. NullPointerException
        System.out.println("curso es nulo: " + (curso == null));
        if(curso == null){
            curso = "Programación Java";
        }
        System.out.println("curso = " + curso);

        //cadena vacia
        curso = "";
        System.out.println("curso tiene " + curso.length() + " caracteres");
        System.out.println("curso es vacio: " + curso.isEmpty());
        System.out.println("curso es blanco: " + curso.isBlank());

        //cadena en blanco
        curso = "   ";
        System.out.println("curso es vacio: " + curso.isEmpty());
        System.out.println("curso es blanco: " + curso.isBlank());

        //añadimos un caracter
        curso = "a";
        System.out.println("curso es vacio: " + curso.isEmpty());
        System.out.println("curso es blanco: " + curso.isBlank());

    }
}
