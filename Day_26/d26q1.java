import java.util.*;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // 1 to 100
        int guess = 0;

        System.out.println("Guess the number between 1 and 100:");

        while (guess != number) {
            guess = sc.nextInt();
            if (guess < number) {
                System.out.println("Too low, try again!");
            } else if (guess > number) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Correct! The number was " + number);
            }
        }
    }
}
