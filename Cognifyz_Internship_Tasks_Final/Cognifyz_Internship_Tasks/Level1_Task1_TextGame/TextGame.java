import java.util.Scanner;
public class TextGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 10) + 1;
        int guess;
        System.out.println("Guess a number between 1 and 10:");
        do {
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too high! Try again.");
            } else if (guess < number) {
                System.out.println("Too low! Try again.");
            }
        } while (guess != number);
        System.out.println("Correct! You win.");
        sc.close();
    }
}
