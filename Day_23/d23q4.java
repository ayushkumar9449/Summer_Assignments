import java.util.*;

class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY STRING:");
        String input = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // ignore spaces
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        if (maxChar != '\0') {
            System.out.println("Max occurring character: " + maxChar);
            System.out.println("Frequency: " + maxCount);
        } else {
            System.out.println("No characters found.");
        }
    }
}
