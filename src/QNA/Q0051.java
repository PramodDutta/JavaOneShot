package src.QNA;


class BaseClass {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class DerivedClass extends BaseClass {
    // This will cause a compilation error because you cannot override a final method
    // void display() {
    //     System.out.println("Trying to override a final method.");
    // }
}

public class Q0051 {
    public static void main(String[] args) {
        new DerivedClass().display();
    }
}
