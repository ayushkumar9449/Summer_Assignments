import java.util.*;

class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[3];
        String[] subjects = {"Math", "Science", "English"};

        int total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 3.0;
        String grade = (percentage >= 75) ? "Distinction" :
                       (percentage >= 60) ? "First Class" :
                       (percentage >= 40) ? "Pass" : "Fail";

        System.out.println("\n--- Marksheet ---");
        System.out.println("Name: " + name);
        for (int i = 0; i < 3; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
