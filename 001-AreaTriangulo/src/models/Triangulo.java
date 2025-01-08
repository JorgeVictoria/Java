package models;

import java.util.Objects;

public class Triangulo {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        return this.base*this.altura/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(triangulo.base, base) == 0 && Double.compare(triangulo.altura, altura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
