package app;

import models.ComparadorNumeros;
import utils.Entrada;
import utils.Salida;

/*
 * Crea un algoritmo llamado comparar que lea dos números
 * enteros positivos n1 y n2. Si el primero es mayor (n1 > n2)
 * escribir 1, si el segundo es mayor (n2 > n1) escribir 2 y si son
 * iguales escribir 0.
 */
public class App {

    public static void main(String[] args) {

        //creamos un comparador de números
        ComparadorNumeros comparadorNumeros = new ComparadorNumeros();

        //Lectura de datos
        comparadorNumeros.setNumA(Entrada.leerDatos("NumA:"));
        comparadorNumeros.setNumB(Entrada.leerDatos("NumB:"));

        //Mostrar el resultado
        Salida.mostrarResultado(comparadorNumeros);

    }
}
