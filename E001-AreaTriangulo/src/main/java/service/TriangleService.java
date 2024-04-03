package service;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Service class to do different operations with triangle
 * @author Jorge Victoria Andreu
 * @since 03-apr-2024
 * @version 1.0
 */
public class TriangleService {

    public double getTriangleMeasures(Scanner stdin, String trianglePart){

        double value = 0.0;
        boolean isValidValue = false;

        while(!isValidValue){
            System.out.printf("%s:",trianglePart);
            try{
                value = stdin.nextDouble();
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
}
