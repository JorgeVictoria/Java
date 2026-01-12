package variables;

public class Constantes {

    // Constante global (a nivel de clase)
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        // Constante local dentro del método
        final int MAX_USERS = 100;

        // Uso de las constantes
        System.out.println("Valor de PI: " + PI);
        System.out.println("Máximo de usuarios permitidos: " + MAX_USERS);

        // Ejemplo práctico: cálculo del área de un círculo
        double radio = 5.0;
        double area = PI * radio * radio;

        System.out.println("Área de un círculo de radio " + radio + " es: " + area);

        // Intentar modificar una constante provocaría un error de compilación
        // MAX_USERS = 200;  // ❌ Error: no se puede reasignar porque es final
    }
}
