package src.QNA;


final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// The following class will cause a compilation error because a final class cannot be extended
// class ExtendedClass extends FinalClass {
//     // ...
// }

public class Q0052 {
    public static void main(String[] args) {
        new FinalClass().display();
    }
}

