import java.util.*;

class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY WORD:");
        String input = sc.nextLine();

        Set<Character> seen = new HashSet<>();
        char result = '\0'; // null char

        for (char ch : input.toCharArray()) {
            if (seen.contains(ch)) {
                result = ch;
                break; // first repeating found
            } else {
                seen.add(ch);
            }
        }

        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found.");
        }
    }
}
