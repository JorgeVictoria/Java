package operadores;

public class Unarios {

    public static void main(String[] args) {
        int a = 5;

        // Operador unario positivo
        int positivo = +a;
        System.out.println("Unario +a: " + positivo);

        // Operador unario negativo
        int negativo = -a;
        System.out.println("Unario -a: " + negativo);

        // Pre-incremento (++a): incrementa antes de usarlo
        int preIncremento = ++a;
        System.out.println("Pre-incremento (++a): " + preIncremento);

        // Post-incremento (a++): usa el valor y luego incrementa
        int postIncremento = a++;
        System.out.println("Post-incremento (a++): " + postIncremento);
        System.out.println("Después de post-incremento, a = " + a);

        // Pre-decremento (--a): decrementa antes de usarlo
        int preDecremento = --a;
        System.out.println("Pre-decremento (--a): " + preDecremento);

        // Post-decremento (a--): usa el valor y luego decrementa
        int postDecremento = a--;
        System.out.println("Post-decremento (a--): " + postDecremento);
        System.out.println("Después de post-decremento, a = " + a);
    }
}
