package app;

import java.util.Scanner;

public class Compare {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        //read the numbers
        int n1 = getValue("n1");
        int n2 = getValue("n2");

        //print result
        System.out.println(printResult(n1, n2));

    }

    //Method for obtaining the values of the numbers
    private static int getValue(String field) {
        while (true) {
            try {
                System.out.print(field + ": ");
                int value = Integer.parseInt(SCANNER.nextLine());
                if (value > 0) {
                    return value;
                }
                System.out.println("The number must be greater than 0");
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input. Please enter a positive number.");
            }
        }
    }

    //Method for print the result
    private static String printResult(int n1, int n2) {
        return String.format("""
            === RESULT ===
            n1      : %d
            n2      : %d
            result  : %d
            """, n1, n2, getResult(n1,n2));
    }

    //Method to compare two numbers
    private static int getResult(int n1, int n2) {
        if(n1 > n2) {
            return 1;
        } else if (n1 < n2) {
            return 2;
        }
        return 0;
    }
}
