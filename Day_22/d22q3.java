import java.util.*;

class CharFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY STRING:");
        String str = sc.nextLine();

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') { 
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
