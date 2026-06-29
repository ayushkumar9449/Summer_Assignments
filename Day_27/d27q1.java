import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +
               ", Age: " + age + ", Course: " + course;
    }
}

public class StudentManagementSystem {
    private static Map<Integer, Student> records = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. View All Students");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudent(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: viewAllStudents(); break;
                case 6: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        if (records.containsKey(id)) {
            System.out.println("ID already exists!");
            return;
        }
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        records.put(id, new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    private static void viewStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        Student s = records.get(id);
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("Student not found!");
        }
    }

    private static void updateStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        Student s = records.get(id);
        if (s != null) {
            System.out.print("Enter new Name: ");
            s.setName(sc.nextLine());
            System.out.print("Enter new Age: ");
            s.setAge(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter new Course: ");
            s.setCourse(sc.nextLine());
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        if (records.remove(id) != null) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    private static void viewAllStudents() {
        if (records.isEmpty()) {
            System.out.println("No records found!");
        } else {
            for (Student s : records.values()) {
                System.out.println(s);
            }
        }
    }
}
