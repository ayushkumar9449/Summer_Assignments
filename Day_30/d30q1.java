import java.util.*;

class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] rollNos = new int[5];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < names.length) {
                        System.out.print("Enter Roll No: ");
                        rollNos[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        count++;
                    } else {
                        System.out.println("Record full!");
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println("Roll No: " + rollNos[i] + ", Name: " + names[i]);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

