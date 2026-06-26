import java.util.*;

class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY STRING:");
        String input = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        char result = '\0'; 
        for (char ch : input.toCharArray()) {
            if (freq.get(ch) == 1) {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
