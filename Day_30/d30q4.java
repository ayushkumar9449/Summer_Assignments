import java.util.*;

class MiniProject {
    static Scanner sc = new Scanner(System.in);
    static String[] students = new String[5];
    static int[] marks = new int[5];
    static int count = 0;

    static void addStudent() {
        if (count < students.length) {
            System.out.print("Enter Name: ");
            students[count] = sc.nextLine();
            System.out.print("Enter Marks: ");
            marks[count] = sc.nextInt();
            sc.nextLine();
            count++;
        } else {
            System.out.println("Record full!");
        }
    }

    static void viewStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + students[i] + ", Marks: " + marks[i]);
        }
    }

    static void searchStudent() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                System.out.println("Found: " + students[i] + " with Marks: " + marks[i]);
                return;
            }
        }
        System.out.println("Not found!");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Search Student\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
