package src.QNA;

public class Q007 {
    public static void main(String[] args) {
        // Purpose of the static keyword in Java

        // A static variable is shared among all instances of a class.
        //A static method belongs to the class, not instances, and can be called without an object.
        //static can be used to create constants and utility functions.
    }
}

class StaticVariableExample {
    // A static variable
    static int counter = 0;

    public StaticVariableExample() {
        counter++;  // Increment the static variable by 1 for every object created
    }

    public static void main(String[] args) {
        new StaticVariableExample();
        new StaticVariableExample();
        new StaticVariableExample();
        System.out.println("Number of instances created: " + StaticVariableExample.counter);
        // Output will be: Number of instances created: 3
    }
}

class StaticMethodExample {
    // A static method
    static void printMessage() {
        System.out.println("Hello, this is a static method.");
    }

    public static void main(String[] args) {
        // Call the static method without creating an instance of the class
        StaticMethodExample.printMessage();
        // Output will be: Hello, this is a static method.
    }
}

class StaticUtilityExample {
    // A static constant
    public static final double PI = 3.14159;

    // A static utility method
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        double area = StaticUtilityExample.calculateCircleArea(5);
        System.out.println("Area of the circle with radius 5 is: " + area);
        // Output will be: Area of the circle with radius 5 is: 78.53975
    }
}


