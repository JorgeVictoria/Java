package models;

/*
 * We can have different classes in the same file, but only one class can be public.
 * When we have two or more classes, it is not mandatory to have a public class, but only one class can be public.
 * In this case, the public class name must be the same as the file name.
 */
public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
