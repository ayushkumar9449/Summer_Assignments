import java.util.*;

class CommonChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) set1.add(c);

        Set<Character> common = new HashSet<>();
        for (char c : s2.toCharArray()) {
            if (set1.contains(c)) common.add(c);
        }

        System.out.println("Common characters: " + common);
    }
}
