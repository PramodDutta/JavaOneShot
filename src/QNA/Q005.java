package src.QNA;

public class Q005 {
    public static void main(String[] args) {
        // Use of the final keyword in Java

        // A final variable can only be assigned once.
        //A final method cannot be overridden by subclasses.
        //A final class cannot be subclassed.

        final int MAX_USERS = 10; // final variable declaration and assignment
        // MAX_USERS = 20; // Uncommenting this line will cause a compilation error because a final variable cannot be reassigned
        System.out.println(MAX_USERS);


    }
}


