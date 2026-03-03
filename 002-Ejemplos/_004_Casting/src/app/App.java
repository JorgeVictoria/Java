package app;

public class App {

	public static void main(String[] args) {
		
		System.out.println("=== PRIMITIVE CASTING ===");

        // 1️. Widening Casting (automatic)
		// Converting a smaller type to a larger type.
		// No data loss
	    // Done automatically
        int intValue = 100;
        double doubleValue = intValue;   // automatic widening
        System.out.println("Widening (int to double): " + doubleValue);

        // 2️. Narrowing Casting (manual)
        // Converting a larger type to a smaller type.
        // May cause data loss
        // Must use parentheses
        double anotherDouble = 99.99;
        int narrowedInt = (int) anotherDouble;  // manual narrowing
        System.out.println("Narrowing (double to int): " + narrowedInt);


        System.out.println("\n=== OBJECT CASTING ===");
        // Used with inheritance (parent and child classes).
        // There are two types:

        // 3. Upcasting (automatic)
        // Child object → Parent reference
        // Safe and automatic.
        // Done automatically
        // Only parent methods accessible
        Animal myAnimal = new Dog();  // Dog → Animal
        myAnimal.makeSound();         // Only Animal methods accessible

        // 4️. Downcasting (manual)
        // Parent reference → Child reference
        // Must be done manually and can cause runtime error.
        Dog myDog = (Dog) myAnimal;   // Animal → Dog
        myDog.makeSound();
        myDog.bark();

        // 5️. Unsafe Downcasting (causes runtime error)
        // Can throw ClassCastException if wrong type
        Animal genericAnimal = new Animal();
        // Dog wrongDog = (Dog) genericAnimal;  // ❌ ClassCastException

        // 6️. Safe Downcasting using instanceof
        // To avoid error, use instanceof:
        if (genericAnimal instanceof Dog) {
            Dog safeDog = (Dog) genericAnimal;
            safeDog.bark();
        } else {
            System.out.println("Cannot cast Animal to Dog safely.");
        }

	}

}

//Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

	// Child class
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Woof Woof!");
    }
}
