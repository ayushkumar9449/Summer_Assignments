import java.util.*;

class SortByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String[] words = sc.nextLine().split("\\s+");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
