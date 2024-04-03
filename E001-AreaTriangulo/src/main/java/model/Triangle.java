package model;

import java.util.Objects;

/**
 * Class with different triangle measures
 * @author Jorge Victoria Andreu
 * @since 03-apr-2024
 * @version 1.0
 */
public class Triangle {

    private double base;
    private double height;
    private double area;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateArea(){
        if(this.height > 0 && this.base > 0){
            this.area = this.base * this.height / 2;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(base, triangle.base) == 0 && Double.compare(height, triangle.height) == 0 && Double.compare(area, triangle.area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height, area);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + area +
                '}';
    }
}
