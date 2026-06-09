import java.util.Scanner;

class FibonacciRecursion {
    // Recursive function to find nth Fibonacci number
    int fibonacci(int n) {
        if (n == 0) return 0;   // base case
        if (n == 1) return 1;   // base case
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        FibonacciRecursion obj = new FibonacciRecursion();

        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }
    }
}
