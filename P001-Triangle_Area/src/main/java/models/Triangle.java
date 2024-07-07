package models;

import java.util.Objects;

/**
 * Triangle class
 * @author Jorge Victoria
 * @version 17.0.8
 */
public class Triangle {

    private double base;
    private double height;

    /**
     * <p>Getter Method</p>
     * @return The base value
     */
    public double getBase() {
        return base;
    }

    /**
     * <p>Setter Method</p>
     * @param base The base value
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * <p>Getter Method</p>
     * @return The height value
     */
    public double getHeight() {
        return height;
    }

    /**
     * <p>Setter Method</p>
     * @param height The height value
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * <p>Equals Method</p>
     * @param o an Object
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(base, triangle.base) == 0 && Double.compare(height, triangle.height) == 0;
    }

    /**
     * <p>HashCode method</p>
     * @return the hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }

    /**
     * <p>toString method</p>
     * @return a String object.
     */
    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
