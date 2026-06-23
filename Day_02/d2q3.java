import java.util.*;

class ProductOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER :");
        int num = sc.nextInt();

        int product = 1;   // start with 1 (neutral for multiplication)
        int temp = num;

        // brute force loop
        while (temp > 0) {
            int digit = temp % 10;     // extract last digit
            product *= digit;          // multiply with product
            temp = temp / 10;          // remove last digit
        }

        System.out.println("PRODUCT OF DIGITS : " + product);
    }
}
