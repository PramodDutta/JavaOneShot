package src.QNA;

public class Q006 {
    public static void main(String[] args) {
        // Implementing multithreading in Java

        // Create a class that extends Thread and override the run() method.
        //Implement the Runnable interface and pass an instance to a Thread object.
        //Use the ExecutorService to manage and execute threads efficiently.
        MyThread t = new MyThread();
        t.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread running");
    }
}


