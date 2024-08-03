import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; // Initialize the book as available by default
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book with ISBN " + isbn + " is borrowed successfully.");
        } else {
            System.out.println("Book with ISBN " + isbn + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book with ISBN " + isbn + " is returned successfully.");
        } else {
            System.out.println("Book with ISBN " + isbn + " is already available.");
        }
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the library.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the library.");
    }
}

public class Librarybook {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");

        library.addBook(book1);
        library.addBook(book2);

        library.displayAvailableBooks();

        library.borrowBook("978-0743273565");
        library.borrowBook("978-0743273565"); // Try to borrow the same book again

        library.returnBook("978-0061120084");
        library.borrowBook("978-0061120084"); // Try to borrow the returned book

        library.displayAvailableBooks();
    }
}
