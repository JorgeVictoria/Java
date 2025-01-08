package models;

import java.util.Objects;

public class ComparadorNumeros {

    private int numA;
    private int numB;

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int compararNumeros(){
        if(this.numA>this.numB){
            return 1;
        } else if (this.numA<this.numB){
            return 2;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        ComparadorNumeros that = (ComparadorNumeros) o;
        return numA == that.numA && numB == that.numB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numA, numB);
    }

    @Override
    public String toString() {
        return "ComparadorNumeros{" +
                "numA=" + numA +
                ", numB=" + numB +
                '}';
    }
}
