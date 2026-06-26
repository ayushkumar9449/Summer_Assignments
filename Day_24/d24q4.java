import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                sb.append(ch);
                seen[ch] = true;
            }
        }

        System.out.println("String after removing duplicates: " + sb.toString());
    }
}
