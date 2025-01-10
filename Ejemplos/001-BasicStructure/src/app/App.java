package app;

import models.Animal;
import models.Cat;

public class App {

    public static void main(String[] args) {

        //We create different objects
        //We can't create a dog object because it is not public, and it is a different package
        Animal animal = new Animal();
        Cat cat = new Cat();

        //We set the name of the animals
        animal.setName("PicoPato");
        cat.setName("minino");

        //We ge the name of the animals
        System.out.println("Animal: " + animal.getName());
        System.out.println("Cat: " + cat.getName());

    }
}
