package app;

import java.util.Scanner;

public class Compare {

    // Single Scanner instance reused to avoid multiple input streams
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        //read the numbers
        int n1 = getValue("n1");
        int n2 = getValue("n2");

        //print result
        printResult(n1, n2);

        // Close resource to prevent resource leak
        SCANNER.close();

    }

    /**
     * Reads a positive integer from console input.
     * Keeps prompting until valid input is provided.
     * Uses nextLine() + parseInt() to avoid Scanner buffer issues.
     */
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

    private static void printResult(int n1, int n2) {
        System.out.printf("""
            === RESULT ===
            n1      : %d
            n2      : %d
            result  : %d
            """, n1, n2, getResult(n1,n2));
    }

    private static int getResult(int n1, int n2) {
        return n1 > n2 ? 1 : n1 < n2 ? 2 : 0;
    }
}
