import java.util.Random;
import java.util.Scanner;

public class GuessingGame10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int target = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();
            if (guess > target) System.out.println("Too high!");
            else if (guess < target) System.out.println("Too low!");
        } while (guess != target);

        System.out.println("Correct! The number was " + target);
    }
}
