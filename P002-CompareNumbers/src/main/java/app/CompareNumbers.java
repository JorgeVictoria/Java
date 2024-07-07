package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create an algorithm called compare that reads two positive integers n1 and n2.
 * If the first one is greater (n1 > n2) write 1.
 * If the second one is greater (n2 > n1) write 2.
 * If they are equal write 0.
 * @author Jorge Victoria Andreu
 * @version 17.0.8
 */
public class CompareNumbers {
    public static final Scanner stdin = new Scanner(System.in);
    public static int n1;
    public static int n2;
    public static final String N1_FIELD_NAME = "n1:";
    public static final String N2_FIELD_NAME = "n2:";

    public static void main(String[] args) {
        n1 = getIntegerValue(N1_FIELD_NAME);
        n2 = getIntegerValue(N2_FIELD_NAME);
        System.out.println(printResult());
        stdin.close();
    }

    /**
     * <p>Method to get an integer value.</p>
     * <p>Also, this method checks if the entered value is correct.</p>
     * <p>If the value is incorrect, this method shows warning messages.</p>
     * @param fieldName the field name.
     * @return an integer value.
     */
    private static int getIntegerValue(String fieldName) {
        int integerValue = 0;
        boolean isValid = false;

        while(!isValid){
            System.out.print(fieldName);
            isValid=true;
            try{
                integerValue = stdin.nextInt();
                if(integerValue<0){
                    throw new IllegalArgumentException("Invalid value. The value entered cannot be 0 or negative.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                isValid=false;
                System.out.println("Invalid value. The value entered must be an integer number.");
            } catch (IllegalArgumentException ex){
                isValid=false;
                System.out.println(ex.getMessage());
            }
        }
        return integerValue;
    }

    /**
     * This method compares two numbers
     * @return the result of the comparison
     */
    private static int getComparisonValue() {
        if(n1>n2) return 1;
        else if(n1<n2) return 2;
        else return 0;
    }

    /**
     * This method build a String object with result of the operation.
     * @return a String object
     */
    private static String printResult() {
        return """
                
                -----------------
                CompareNumbers  |
                -----------------
                n1: %d
                n2: %d
                Value: %d
                %n""".formatted(n1,n2,getComparisonValue());
    }



}
