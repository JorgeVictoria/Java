/*
Read the base and height of a triangle and display the area:
area = base x height / 2
 */

package app;

import java.util.Scanner;

public class App {

    private static final Scanner STDIN = new Scanner(System.in);

    public static void main(String[] args) {

        //Read the base and the height of a triangle
        double base = getValue("Base");
        double height = getValue("Height");

        //Calculate the area of the triangle
        double area = getArea(base, height);

        //Print the result
        System.out.println(getResult(base, height, area));

    }

    //Method for obtaining the value of each side of the triangle.
    private static double getValue(String field) {
        while(true){
            try{
                System.out.print(field + ": ");
                double value = Double.parseDouble(STDIN.nextLine());
                if(value > 0){
                    return value;
                }
                System.out.println("The value must be positive");
            } catch (NumberFormatException ex){
                System.out.println("Incorrect value. Please enter a positive number");
            }
        }
    }

    //Method to calculate the area of a triangle
    private static double getArea(double base, double height) {
        return base * height / 2;
    }

    //Method to print the final result
    private static String getResult(double base, double height, double area) {
        return String.format("""
            === RESULT ===
            Base   : %.2f
            Height : %.2f
            Area   : %.2f
            """, base, height, area);
    }
}

