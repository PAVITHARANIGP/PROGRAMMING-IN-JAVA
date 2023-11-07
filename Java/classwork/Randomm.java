import java.util.Random;
import java.util.Scanner;

public class Randomm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int maxAttempts = 5;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.\n");
        
        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int userGuess = scanner.nextInt();
            
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the number correctly!");
                return;
            }
            
            System.out.println("Try " + (userGuess < numberToGuess ? "higher" : "lower") + "!");
        }
        
        System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
        scanner.close();
    }
}