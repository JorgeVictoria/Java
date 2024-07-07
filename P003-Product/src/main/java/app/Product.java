package app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create an algorithm called product that reads two numbers (n1 and n2) positive integers and calculates and displays
 * their multiplication without using the multiply operator (*).
 * Hint: n1 x n2 is adding n2 times the number n1.
 * @author Jorge Victoria Andreu
 * @version 17.0.8
 */
public class Product {

    public static final Scanner stdin = new Scanner(System.in);
    public static int n1;
    public static int n2;
    public static final String N1_FIELD_NAME = "n1:";
    public static final String N2_FIELD_NAME = "n2:";

    /**
     * <p>Main Method</p>
     * @param args external arguments
     */
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
     * This method builds a String object with the product of two integers numbers.
     * In this case we use addition operation
     * @return a String object
     */
    private static StringBuilder getProduct(){
        StringBuilder sb = new StringBuilder();
        if(n2==1){
            sb.append("%d x 1 = %d".formatted(n1, n1));
        } else {
            int result=0;
            for(int i = 1;i <= n2; i++){
                result += n1;
                if(i<n2){
                    sb.append("%d + ".formatted(n1));
                } else {
                    sb.append("%d = %d".formatted(n1, result));
                }
            }
        }
        return sb;
    }

    /**
     * This method build a String object with result of the operation.
     * @return a String object
     */
    private static String printResult() {
        return """
                
                -----------------
                |    Product    |
                -----------------
                n1: %d
                n2: %d
                Value: %s
                %n""".formatted(n1,n2,getProduct());
    }
}
