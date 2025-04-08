package cadenas;

public class Declaracion {

    public static void main(String[] args) {

        //Declaración
        String saludo = "Hola mundo";
        System.out.println("saludo = " + saludo);

        var otroSaludo = "Hola a todos";
        System.out.println("otroSaludo = " + otroSaludo);

        String str = new String("Hola");
        System.out.println("str = " + str);

        char cadenaArray[] = {'H','o','l','a'};
        for (char caracter:cadenaArray
             ) {
            System.out.print(caracter);
        }
        System.out.println();

        //nueva referencia al mismo objeto
        String copiaSaludo = saludo;
        System.out.println("copiaSaludo = " + copiaSaludo);

        //multilínea
        String multilinea= """
                En un puerto italiano
                vivia nuestro amigo Marco
                """;
        System.out.println("multilinea = " + multilinea);

    }
}
