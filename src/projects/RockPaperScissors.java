package src.projects;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.next();

        int computerIndex = random.nextInt(choices.length);
        String computerChoice = choices[computerIndex];

        System.out.println("Computer's choice: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors") ||
                userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper") ||
                userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}

