import java.util.Scanner;

public class d6q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        int decimal = 0;
        int power = 0;

        // Traverse from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);

    }
}
