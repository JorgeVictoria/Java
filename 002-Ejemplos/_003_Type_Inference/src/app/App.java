package app;

import java.util.List;

/**
 * Type inference is a feature that allows the Java compiler to automatically determine the type of a variable or expression without you explicitly declaring it.
 *  This makes code shorter and more readable while still being strongly typed.
 */

public class App {

	public static void main(String[] args) {
		
		// Integer
        var age = 25;               // int

        // Double
        var price = 19.99;          // double

        // Float
        var temperature = 36.6f;    // float

        // String
        var name = "Alice";         // String

        // Boolean
        var isActive = true;        // boolean

        // Character
        var letter = 'A';           // char

        System.out.println("age type: int -> " + age);
        System.out.println("price type: double -> " + price);
        System.out.println("temperature type: float -> " + temperature);
        System.out.println("name type: String -> " + name);
        System.out.println("isActive type: boolean -> " + isActive);
        System.out.println("letter type: char -> " + letter);
        
        //other examples
        var list = new java.util.ArrayList<>();
        list.add("Hello");
        list.forEach(a -> System.out.println(a));
        
        var numbers = List.of(1, 2, 3, 4);
        numbers.forEach(n -> System.out.println(n * 2)); // 'n' inferred as Integer
        
	}

}
