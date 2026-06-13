import java.util.*;

class ReverseNumber {
    // Recursive function to reverse digits
    int rev(int n, int r) {
        if (n == 0) {
            return r;  // base case: return the accumulated reverse
        } else {
            int d = n % 10;
            r = (r * 10) + d;
            return rev(n / 10, r); // recursive call with updated reverse
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER :");
        int q = sc.nextInt();

        ReverseNumber obj = new ReverseNumber();
        int result = obj.rev(q, 0); // start with r = 0

        System.out.println("REVERSED NUMBER : " + result);
    }
}
