import java.util.*;

class SalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Double> salaries = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add Salary\n2. View Salary\n3. Update Salary\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();
                    salaries.put(id, sal);
                    break;
                case 2:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    System.out.println("Salary: " + salaries.getOrDefault(id, 0.0));
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    if (salaries.containsKey(id)) {
                        System.out.print("Enter New Salary: ");
                        sal = sc.nextDouble();
                        salaries.put(id, sal);
                        System.out.println("Updated!");
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
