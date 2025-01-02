package string;

public class CreacionObjetosString {

    public static void main(String[] args) {

        //Creación directa
        String cadena1 = "Curso de Java";

        //Creación mediante new
        String cadena2 = new String("Curso de Java");

        //comparamos si son la misma instancia
        boolean mismoObjeto = cadena1==cadena2;
        System.out.println("mismoObjeto = " + mismoObjeto);
        
        //comparamos el contenido
        boolean mismoContenido = cadena1.equals(cadena2);
        System.out.println("mismoContenido = " + mismoContenido);

        //Cuando se crean 2 objetos String con literal y cuyo valor es el mismo
        //no se crea un nuevo objeto sino que asigna la referencia
        String cadena3 = "Curso de Java";
        mismoObjeto = cadena1==cadena3;
        System.out.println("mismoObjeto = " + mismoObjeto);

    }
}
