<<<<<<< Updated upstream
import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess a number between 1 and 100:");
            int guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed correctly!");
                break;
            }
        }
    }
}
=======
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int targetNumber = rand.nextInt(99) + 1; // generates a random number between 10 and 99
        int userGuess;
        int guessCount = 0;
        Scanner input = new Scanner(System.in);

        while (guessCount < 5) {
            System.out.println("Enter a two-digit number (attempt " + (guessCount + 1) + " out of 5): ");
            try {
                userGuess = input.nextInt();
                if (userGuess < 10 || userGuess > 99) {
                    System.out.println("Error: Please enter a two-digit number.");
                    continue;
                }

                if (userGuess == targetNumber) {
                    System.out.println("Hit! You've guessed the number correctly.");
                    break;
                } else {
                    if (Math.abs(userGuess - targetNumber) >= 20) {
                        System.out.println("Your guess is off by 20 or more.");
                    }
                    if (userGuess > targetNumber) {
                        System.out.println("Your guess is larger than the target number.");
                    } else {
                        System.out.println("Your guess is smaller than the target number.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter an integer.");
                input.next();  // discard non-integer input
            }
            guessCount++;
            if (guessCount == 5) {
                System.out.println("Game over! You didn't guess the number within 5 attempts. The number was: " + targetNumber);
            }
        }
        input.close();
    }
}
>>>>>>> Stashed changes
