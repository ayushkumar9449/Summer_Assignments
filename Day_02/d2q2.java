import java.util.*;

class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER :");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        // brute force loop
        while (temp > 0) {
            int digit = temp % 10;       // extract last digit
            rev = (rev * 10) + digit;    // build reversed number
            temp = temp / 10;            // remove last digit
        }

        System.out.println("REVERSED NUMBER : " + rev);
    }
}
