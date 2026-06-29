import java.util.*;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        while (true) {
            System.out.println("\n1. Length\n2. Reverse\n3. Uppercase\n4. Lowercase\n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Length: " + str.length());
                    break;
                case 2:
                    System.out.println("Reverse: " + new StringBuilder(str).reverse());
                    break;
                case 3:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;
                case 4:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
