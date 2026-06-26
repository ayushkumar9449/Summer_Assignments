import java.util.Scanner;

class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
