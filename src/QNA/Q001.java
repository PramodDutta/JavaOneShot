package src.QNA;

public class Q001 {
    public static void main(String[] args) {

        // Difference between == and .equals() in Java

        // == checks for reference equality, meaning it checks if both variables point to the same object in memory.
        //.equals() checks for value equality, meaning it checks if the values of two objects are the same.

        String a = new String("test");
        String b = new String("test");
        System.out.println(a == b); // false, different references
        System.out.println(a.equals(b)); // true, same value


    }
}
