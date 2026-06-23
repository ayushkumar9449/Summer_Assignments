import java.util.*;

class SumOfDigitsBruteForce {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER :");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        // brute force loop
        while (temp > 0) {
            int digit = temp % 10;   // extract last digit
            sum += digit;            // add to sum
            temp = temp / 10;        // remove last digit
        }

        System.out.println("SUM OF DIGITS : " + sum);
    }
}
