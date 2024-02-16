package miniproject;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Initialize variables
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        // Main game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");

            // Get user input
            int userGuess = scanner.nextInt();
            attempts++;

            // Check if the guess is correct
            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Game over
        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        scanner.close();
    }
}
