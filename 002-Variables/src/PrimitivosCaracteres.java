public class PrimitivosCaracteres {
    public static void main(String[] args) {

        //caracter literal
        char caracter = 'a';
        System.out.println("caracter = " + caracter);

        //caracter unicode (mapa de caracteres S.0.)
        char unicode = '\u0061';
        System.out.println("unicode = " + unicode);
        
        //caracter ascii (tabla ascii)
        char ascii = 97;
        System.out.println("ascii = " + ascii);
        
        //uso de var
        var letra = 'p';
        System.out.println("letra = " + letra);
        
        //Constantes
        System.out.println("Valor mínimo = " + Character.MIN_VALUE);
        System.out.println("Valor máximo = " + Character.MAX_VALUE);
        System.out.println("Nº de bits = " + Character.SIZE);
        System.out.println("Nº de bytes = " + Character.BYTES);

    }
}
