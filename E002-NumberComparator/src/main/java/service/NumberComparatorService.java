package service;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Service class to do different operations.
 * @author Jorge Victoria Andreu
 * @since 03-apr-2024
 * @version 1.0
 */
public class NumberComparatorService {

    public int getNumberValue(Scanner stdin, String numberName){

        int value = 0;
        boolean isValidValue = false;

        while(!isValidValue){
            System.out.printf("%s:",numberName);
            try{
                value = stdin.nextInt();
                isValidValue = true;
                if(value <= 0) {
                    throw new IllegalArgumentException("The value must be positive.");
                }
            } catch (InputMismatchException ex){
                stdin.next();
                isValidValue=false;
                System.out.println("The value has not a valid format.");
            } catch (IllegalArgumentException ex){
                isValidValue=false;
                System.out.println(ex.getMessage());
            }
        }

        return value;

    }

    public  int getComparisonResult(int n1, int n2){
        if(n1 > n2) return 1;
        else if(n2 > n1) return 2;
        else return 0;
    }

    public void printResult(int n1, int n2, int comparisonResult){
        System.out.println();
        System.out.printf("n1 : %d\n",n1);
        System.out.printf("n2 : %d\n",n2);
        System.out.printf("Comparison Result : %d\n",comparisonResult);
    }

}
