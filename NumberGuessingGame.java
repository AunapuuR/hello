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