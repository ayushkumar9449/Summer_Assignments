import java.util.*;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department);
    }
}

class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Employee\n2. View Employees\n3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    employees.add(new Employee(id, name, dept));
                    break;
                case 2:
                    for (Employee e : employees) e.display();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
