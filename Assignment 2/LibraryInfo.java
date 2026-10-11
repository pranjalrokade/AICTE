abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void showRole();
}

class Student extends User {
    public Student(String name) {
        super(name);
    }

    @Override
    void showRole() {
        System.out.println("Role: Student");
    }
}

class Book {
    private String title;
    private String author;
    private double price;
    private boolean borrowed;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Borrowed: " + borrowed);
    }
}

class Library {
    private Book book;

    public void addBook(Book book) {
        this.book = book;
        System.out.println("Book added to the library.");
    }

    public void displayBook() {
        if (book != null) {
            book.displayDetails();
        } else {
            System.out.println("No book available.");
        }
    }

    public void borrowBook() {
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("No book available to borrow.");
        }
    }

    public void returnBook() {
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("No book available to return.");
        }
    }
}

public class LibraryInfo {
    public static void main(String[] args) {
        Student student = new Student("Pranjal");

        Book book = new Book(
            "Java Programming",
            "James",
            450.50
        );

        Library library = new Library();

        student.showRole();
        System.out.println("User: " + student.getName());

        library.addBook(book);

        System.out.println("\nBook Details:");
        library.displayBook();

        System.out.println("\nBorrowing Book:");
        library.borrowBook();

        System.out.println("\nReturning Book:");
        library.returnBook();

        System.out.println("\nFinal Book Details:");
        library.displayBook();
    }
}
