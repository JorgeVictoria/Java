package app;

import models.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Read the base and height of a triangle and show the area:
 * area = base x height / 2
 * @author Jorge Victoria
 * @link
 * @version 17.0.8
 */
public class TriangleArea {
    private static final Scanner stdin = new Scanner(System.in);
    private static final String BASE = "Base:";
    private static final String HEIGHT = "Height:";

    /**
     * <p>Main Method</p>
     * @param args external arguments
     */
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.setBase(getTriangleSideValue(BASE));
        triangle.setHeight(getTriangleSideValue(HEIGHT));
        System.out.println(toString(triangle));
    }

    /**
     * <p>Method to get the triangle side value.</p>
     * <p>Also, this method checks if the entered value is correct.</p>
     * <p>If the value is incorrect, this method shows warning messages.</p>
     * @param triangleSide the triangle side (base or height)
     * @return the value of the triangle side
     */
    private static double getTriangleSideValue(String triangleSide) {
        double triangleSideValue = 0.0;
        boolean isValid = false;

        while(!isValid){
            System.out.print(triangleSide);
            isValid=true;
            try{
                triangleSideValue = stdin.nextDouble();
                if(triangleSideValue<0){
                    throw new IllegalArgumentException("Invalid value. The value entered cannot be 0 or negative.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                isValid=false;
                System.out.println("Invalid value. The value entered must be a number.");
            } catch (IllegalArgumentException ex){
                isValid=false;
                System.out.println(ex.getMessage());
            }
        }
        return triangleSideValue;
    }

    /**
     * <p>This method calculates the area of a triangle</p>
     * @param triangle a Triangle object
     * @return the area of the triangle
     */
    private static double getArea(Triangle triangle){
        return triangle.getBase()*triangle.getHeight()/2;
    }

    /**
     * <p>This method build a String with a review of the triangle values.</p>
     * @param triangle a Triangle object
     * @return a String object with a review of the triangle values.
     */
    private static String toString(Triangle triangle) {
        return """
                
                -----------
                Triangle  |
                -----------
                Base: %.2f
                Height: %.2f
                Area: %.2f
                %n""".formatted(triangle.getBase(),triangle.getHeight(),getArea(triangle));
    }
}
