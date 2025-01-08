package app;

import models.Triangulo;
import utils.Entrada;
import utils.Salida;

/*
 * Lee la base y la altura de un triángulo y muestra el área:
 * área = base x altura / 2
 */
public class App {

    public static void main(String[] args) {

        //Creamos el triángulo
        Triangulo triangulo = new Triangulo();

        //leemos la base y la altura
        triangulo.setBase(Entrada.leerDatos("Base"));
        triangulo.setAltura(Entrada.leerDatos("Altura:"));

        //mostrar datos por pantalla
        Salida.mostrarResultado(triangulo);
    }
}
