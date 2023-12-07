package src.QNA;

public class Q010 {
    public static void main(String[] args) {

        // Differences Between Abstract Classes and Interfaces in Java


        // Abstract Classes:
        //Can have both abstract and concrete methods.
        //Can have constructors.
        //Can have fields that are non-final and non-static.
        //A class can extend only one abstract class due to single inheritance.

    }
}

abstract class Animal {
    // An abstract method
    public abstract void makeSound();

    // A concrete method with implementation
    public void breathe() {
        System.out.println("Animal is breathing.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }
}

// Interfaces:
//All methods are abstract by default, but can have default and static methods with implementation from Java 8 onwards.
//Cannot have constructors.
//All fields are public, static, and final by default.
//A class can implement multiple interfaces
//

interface Animal1 {
    // An abstract method by default
    void makeSound();

    // A default method (since Java 8)
    default void breathe() {
        System.out.println("Animal is breathing.");
    }
}

class Dog1 implements Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }
}




