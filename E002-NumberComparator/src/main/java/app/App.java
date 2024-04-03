package app;

import service.NumberComparatorService;

import java.util.Scanner;

/**
 * Create an algorithm that reads two positive integers n1 and n2.
 * If the first is greater (n1 > n2) write 1, if the second is greater (n2 > n1) write 2 and if they
 * are equal write 0.
 * @author Jorge Victoria Andreu
 * @since 03-apr-2024
 * @version 1.0
 */
public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {

        NumberComparatorService numberComparatorService = new NumberComparatorService();

        int n1 = numberComparatorService.getNumberValue(stdin, "n1");
        int n2 = numberComparatorService.getNumberValue(stdin, "n2");
        int comparisonResult = numberComparatorService.getComparisonResult(n1, n2);
        numberComparatorService.printResult(n1,n2,comparisonResult);
        stdin.close();

    }
}
