import java.util.*;

class Book {
    int id;
    String title, author;
    boolean isAvailable;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Book\n2. View Books\n3. Borrow Book\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    books.add(new Book(id, title, author));
                    break;
                case 2:
                    for (Book b : books) b.display();
                    break;
                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    id = sc.nextInt();
                    for (Book b : books) {
                        if (b.id == id && b.isAvailable) {
                            b.isAvailable = false;
                            System.out.println("Book borrowed successfully!");
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
