package operadores;

public class Precedencia {

    public static void main(String[] args) {

        //    PRECEDENCIA COMÚN
        //    1. Paréntesis ()
        //    2. Unarios (+, -, ++, --)
        //    3. Multiplicación, división, módulo (*, /, %)
        //    4. Suma y resta (+, -)
        //    5. Asignación (=, +=, -= …)

        int a = 10;
        int b = 5;
        int c = 2;

        // Sin paréntesis. Multiplicación se evalúa primero
        int resultado1 = a + b * c;
        System.out.println("a + b * c = " + resultado1);

        // Con paréntesis. Paréntesis cambian la precedencia
        int resultado2 = (a + b) * c;
        System.out.println("(a + b) * c = " + resultado2);

        // Uso de unarios y mezcla
        int resultado3 = -a + b * ++c;
        // Primero ++c → c = 3
        // Luego multiplicación b * 3 = 15
        // Después -a = -10
        // Finalmente -10 + 15 = 5
        System.out.println("-a + b * ++c = " + resultado3);

        // Combinación con división y módulo
        int resultado4 = a + b / c % 3;
        System.out.println("a + b / c % 3 = " + resultado4);
    }
}
