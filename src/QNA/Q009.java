package src.QNA;

public class Q009 {
    public static void main(String[] args) {

        // How to Achieve Encapsulation in Java:

        // Encapsulation is one of the four fundamental OOP concepts
        // The main idea behind encapsulation is to hide the internal state of objects and
        // require all interaction to be performed through an object's methods.

//        Here’s how you can achieve encapsulation in Java:
//
//        Declare the variables of a class as private.
//        Provide public setter and getter methods to modify and view the variables' values.
//        The setter method can include validation to maintain the integrity of the data.

        EncapsulatedObject obj = new EncapsulatedObject();
        obj.setName("John");
        obj.setAge(30);
        System.out.println("Name: " + obj.getName() + ", Age: " + obj.getAge());



    }
}

class EncapsulatedObject {
    // 1. Variables are declared private
    private String name;
    private int age;

    // 2. Getter and setter methods are provided for access
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        // 3. Validation could be added here
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        // 3. Validation could be added here
        age = newAge;
    }
}


