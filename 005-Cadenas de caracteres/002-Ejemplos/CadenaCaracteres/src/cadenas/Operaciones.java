package cadenas;

public class Operaciones {

    public static void main(String[] args) {

        //Concatenación
        String msg = "Hola " + "Mundo";
        System.out.println("msg = " + msg);
        
        String msg2 = "Hola ";
        msg2 = "a todos";
        System.out.println("msg2 = " + msg2);
        
        String msg3 = "hola";
        msg3 = msg3.concat(" de nuevo");
        System.out.println("msg3 = " + msg3);

        String multi1 = """
                Una cadena multilínea
                no muy grande
                """;

        String multi2 = """
                Otra cadena multilinea
                no muy grande
                """;

        String msg4 = multi1.concat(multi2);
        System.out.println("msg4 = " + msg4);
        
        String msgPrecio = "El precio del producto es " + 36.5;
        System.out.println("msgPrecio = " + msgPrecio);
        
        //Escape de caracteres
        String titulo = "\"X-men\" de Grant Morrison";
        System.out.println("titulo = " + titulo);
        String salto = "Cadena con salto de \nlinea";
        System.out.println("salto = " + salto);
        String tabular = "Cadena con \ttabulación";
        System.out.println("tabular = " + tabular);

        //Cadenas con formato
        String msg8 = String.format("%d %s %d %s %d",3,"+",2,"=",3+2);
        System.out.println("msg8 = " + msg8);
        String ms9 = String.format("%.2f",2.1416);
        System.out.println("ms9 = " + ms9);
        String msg10 = String.format("%e",3.3);
        System.out.println("msg10 = " + msg10);
    }
}
