import java.util.*;

class Contact {
    String name, phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name: " + name + ", Phone: " + phone);
    }
}

class ContactManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Contact\n2. View Contacts\n3. Search Contact\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    contacts.add(new Contact(name, phone));
                    break;
                case 2:
                    for (Contact c : contacts) c.display();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    for (Contact c : contacts) {
                        if (c.name.equalsIgnoreCase(search)) c.display();
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
