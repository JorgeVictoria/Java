package models;

import java.util.Objects;

public class Coche {

    private String marca;
    private String modelo;
    private int anyo;

    //Constructor vacío
    public Coche(){}

    //Constructor con todos los elementos
    public Coche(String marca, String modelo, int anyo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
    }

    //Constructor con no todos los atributos.
    // Opcionalmente podemos usar otros constructores para añadir valores a los atributos con this
    public Coche(String marca, String modelo) {
        this(marca, modelo, 2025);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void arrancar(){
        System.out.printf("El coche %s %s %d ha arrancado%n", this.marca, this.modelo, this.anyo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Coche coche = (Coche) o;
        return anyo == coche.anyo && Objects.equals(marca, coche.marca) && Objects.equals(modelo, coche.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anyo);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + anyo +
                '}';
    }
}
