import java.util.*;

class MiniEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] ids = new int[5];
        String[] dept = new String[5];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Employee\n2. View Employees\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < names.length) {
                        System.out.print("Enter ID: ");
                        ids[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Department: ");
                        dept[count] = sc.nextLine();
                        count++;
                    } else {
                        System.out.println("Employee list full!");
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + ids[i] + ", Name: " + names[i] + ", Dept: " + dept[i]);
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
