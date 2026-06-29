import java.util.*;

class Item {
    int id;
    String name;
    int quantity;

    Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Quantity: " + quantity);
    }
}

class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> inventory = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Item\n2. View Inventory\n3. Update Quantity\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    inventory.add(new Item(id, name, qty));
                    break;
                case 2:
                    for (Item i : inventory) i.display();
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextInt();
                    for (Item i : inventory) {
                        if (i.id == id) {
                            System.out.print("Enter new quantity: ");
                            i.quantity = sc.nextInt();
                            System.out.println("Updated!");
                        }
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
