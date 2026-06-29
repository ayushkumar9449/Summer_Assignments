import java.util.*;

class MiniLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = new String[5];
        boolean[] available = new boolean[5];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Book\n2. View Books\n3. Borrow Book\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < books.length) {
                        System.out.print("Enter Book Title: ");
                        books[count] = sc.nextLine();
                        available[count] = true;
                        count++;
                    } else {
                        System.out.println("Library full!");
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println((i+1) + ". " + books[i] + " - " + (available[i] ? "Available" : "Borrowed"));
                    }
                    break;
                case 3:
                    System.out.print("Enter book number to borrow: ");
                    int b = sc.nextInt();
                    if (b > 0 && b <= count && available[b-1]) {
                        available[b-1] = false;
                        System.out.println("Book borrowed!");
                    } else {
                        System.out.println("Invalid or unavailable!");
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
