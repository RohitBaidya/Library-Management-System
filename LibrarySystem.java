import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Librarian Name: ");
        String librarianName = sc.nextLine();

        System.out.print("Enter Book Title: ");
        String bookTitle = sc.nextLine();

        Librarian librarian = new Librarian("L001", librarianName);
        Book book = new Book("B001", bookTitle);

        librarian.issueBook(book);
    }
}

class Librarian {
    String name;

    public Librarian(String id, String name) {
        this.name = name;
    }

    void issueBook(Book book) {
        System.out.println("Librarian " + name + " issued book: " + book.title);
    }
}

class Book {
    String title;

    public Book(String id, String title) {
        this.title = title;
    }
}
