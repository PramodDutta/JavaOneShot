package src.learning.loops_03.ifDemo;

import java.util.Scanner;

public class EOProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Even and ODD Program\n");
        System.out.println("Enter your Number!!\n");

        // Pseudo Code
        // 1. Take input from user
        // 10 -> // 10 even or odd?
        // ?  10/2 -> Reminder 0

        // 2. Logic
        // 10%2 == 0 -> even , 10%2 !=0 -> Odd


        // 3. Write the code
        // Take input from user
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();

        if(user_input%2 == 0){
            System.out.println("Even!!");
        }else{
            System.out.println("ODD");
        }






    }
}
