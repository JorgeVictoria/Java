public class UsoVariables {
    public static void main(String[] args) {
        String saludar = "Saludos desde Java";
        System.out.println(saludar);
        //El método String ofrece métodos para el manejo de instancias
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        if (valor){
            //Como la variable pertenece al método padre, está dentro del ámbito de uso. Podemos utilizarla
            System.out.println("numero = " + numero);
            int numero2 = 20;
        }

        //La variable está fuera del ámbito, pertenece al método. No podemos utilizarla
        //System.out.println("numero2 = " + numero2);

        //uso de la variable var
        var numero3 = 30;
        System.out.println("numero3 = " + numero3);
    }
}
