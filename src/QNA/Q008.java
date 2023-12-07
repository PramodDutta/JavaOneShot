package src.QNA;

import java.util.Arrays;
import java.util.List;

public class Q008 {
    public static void main(String[] args) {
        // Java Streams and their benefits


        //Streams provide a high-level abstraction for sequences of elements.
        //Allow functional-style operations on collections, like map, filter, reduce.
        //Enable efficient processing of large data sets with parallel operations.

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println); // C1 C2

    }
}
