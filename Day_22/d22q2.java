import java.util.*;

class WordCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY SENTENCE:");
        String az = sc.nextLine();

        int count = 0;
        char ch;
        String temp = "";

        for (int i = 0; i < az.length(); i++) {
            ch = az.charAt(i);

            if (ch != ' ') {
                temp = temp + ch;
            } else {
                if (!temp.isEmpty()) {  
                    count++;
                    temp = "";     
                }
            }
        }

        if (!temp.isEmpty()) {
            count++;
        }

        System.out.println("NO OF WORDS ARE: " + count);
    }
}
