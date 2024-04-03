package app;

import model.Triangle;
import service.TriangleService;

import java.util.Scanner;

/**
 * Reads the base and height of a triangle and shows the area: area = base x height / 2
 * @author Jorge Victoria Andreu
 * @since 03-apr-2024
 * @version 1.0
 */
public class App {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        TriangleService triangleService = new TriangleService();

        triangle.setBase(triangleService.getTriangleMeasures(stdin, "Base"));
        triangle.setHeight(triangleService.getTriangleMeasures(stdin, "Height"));
        triangle.calculateArea();

        System.out.println(triangle);
        stdin.close();
        
    }


}
