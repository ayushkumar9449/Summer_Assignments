import java.util.Scanner;

class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Q1: What is the capital of India?");
        System.out.println("a) Delhi  b) Mumbai  c) Kolkata");
        char ans1 = sc.next().charAt(0);
        if (ans1 == 'a' || ans1 == 'A') score++;

        System.out.println("Q2: Which language is used for Android development?");
        System.out.println("a) Python  b) Java  c) C++");
        char ans2 = sc.next().charAt(0);
        if (ans2 == 'b' || ans2 == 'B') score++;

        System.out.println("Q3: Who is known as the father of computers?");
        System.out.println("a) Charles Babbage  b) Alan Turing  c) Bill Gates");
        char ans3 = sc.next().charAt(0);
        if (ans3 == 'a' || ans3 == 'A') score++;

        System.out.println("Your final score: " + score + "/3");
    }
}
