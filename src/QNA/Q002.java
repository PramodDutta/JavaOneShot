package src.QNA;

public class Q002 {
    public static void main(String[] args) {
        // How Java handles memory management

        // Java uses a garbage collector to free up memory by automatically deleting objects that are no longer reachable in the code.
        // Memory is allocated from the heap for new objects.
        //Developers do not need to manually allocate or deallocate memory.

        // Creating an object of the String class
        String str = new String("Hello, World!");

        // The above object is now in use and cannot be collected by the GC.

        // Reassigning the reference to a new object
        str = new String("Goodbye, World!");

        // At this point, the String "Hello, World!" is no longer reachable.
        // The GC will mark it and eventually collect it to free up memory.

        // Explicitly setting the object to null
        str = null;

        // Now, the String "Goodbye, World!" is also no longer reachable.
        // It becomes eligible for garbage collection.

        // Suggesting JVM to run Garbage Collector
        System.gc();

        // The rest of the program...


    }
}
