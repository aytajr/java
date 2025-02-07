import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        int[] guesses = new int[100];
        int attempts = 0;

        // System.out.println(name);

        Random random = new Random();
        int hiddenNumber = random.nextInt(101);

        while (true) {
            System.out.print("Please, enter your guess: ");

            int guess;

            while (true) {
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    break;
                } else {
                    System.out.print("Invalid input! Please, enter an integer: ");
                    scanner.next();
                }
            }

            guesses[attempts++] = guess;

            if (guess < hiddenNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > hiddenNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        System.out.print("Your numbers: ");
        int[] enteredNumbers = Arrays.copyOf(guesses, attempts);
        Arrays.sort(enteredNumbers);
        for (int i = attempts - 1; i >= 0; i--) {
            System.out.print(enteredNumbers[i] + " ");
        }
        System.out.println();

        scanner.close();

    }
}
