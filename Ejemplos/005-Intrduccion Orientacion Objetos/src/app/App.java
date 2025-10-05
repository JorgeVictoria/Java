package app;

import models.Coche;

public class App {

    private static final String PEUGEOT = "Peugeot";

    public static void main(String[] args) {

        //Uso del constructor con todos los atributos
        Coche coche1 = new Coche(PEUGEOT, "208", 2025);
        coche1.arrancar();

        //Uso del constructor con varios atributos
        Coche coche2 = new Coche(PEUGEOT, "2008");
        coche2.arrancar();

        //Uso del constructor vacío
        Coche coche3 = new Coche();
        //uso de los metodos setters para pasar datos del coche
        coche3.setMarca(PEUGEOT);
        coche3.setModelo("3008");
        coche3.setAnyo(2018);
        //uso de los metodos getter para obtener datos del coche
        System.out.printf("Tenemos un %s %s del año %d%n",coche3.getMarca(), coche3.getModelo(), coche3.getAnyo());

        //Uso del método toString. No hace falta invocar al método explícitamente, pero podemos añadir toString
        System.out.println(coche1);

        //uso del método equals
        System.out.println("Coche1 y Coche2 son iguales = " + coche1.equals(coche2));

        //uso del método hashCode
        System.out.println("hashcode de coche3 = " + coche3.hashCode());
    }
}
