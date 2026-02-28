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
        printResult(base, height, area);

        // Close resource to prevent resource leak
        STDIN.close();

    }

    /**
     * Reads a positive double from console input.
     * Keeps prompting until valid input is provided.
     * Uses nextLine() + parseDouble() to avoid Scanner buffer issues.
     */
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

    private static double getArea(double base, double height) {
        return base * height / 2;
    }

    private static void printResult(double base, double height, double area) {
        System.out.printf("""
            === RESULT ===
            Base   : %.2f
            Height : %.2f
            Area   : %.2f
            """, base, height, area);
    }
}

