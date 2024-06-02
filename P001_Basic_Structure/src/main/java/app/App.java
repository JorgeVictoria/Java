package app;

/*
 * We have two classes in class file
 * but only one is allowed to be public
 */
public class App {
    public static void main(String[] args) {
        //We create new Animal object
        Animal animal = new Animal();

        //We set the animal name
        animal.setName("Perico");

        //We and print the animal name
        System.out.println(animal.getName());
    }
}

/*
 * class for animals
 * This class includes fields and some methods
 */
class Animal {

    //fields
    private String name;

    /**
     * Getter method
     * @return a String object with the animal name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method
     * @param name, a String object with the animal nane
     */
    public void setName(String name) {
        this.name = name;
    }
}

