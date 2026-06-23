import java.util.*;

class PalindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER :");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        // reverse the number
        while (temp > 0) {
            int digit = temp % 10;       // extract last digit
            rev = (rev * 10) + digit;    // build reversed number
            temp = temp / 10;            // remove last digit
        }

        // check palindrome
        if (num == rev) {
            System.out.println("PALINDROME NUMBER");
        } else {
            System.out.println("NOT A PALINDROME NUMBER");
        }
    }
}
