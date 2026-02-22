class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    Book[] books;
    
    Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }
    
    void displayBooks() {
        System.out.println("Library: " + name);
        System.out.println("Books available:");
        for (Book b : books) {
            b.display();
        }
    }
}

public class q39 {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Programming", "James Gosling"),
            new Book("Python Basics", "Guido van Rossum"),
            new Book("C++ Primer", "Stanley Lippman")
        };
        Library lib = new Library("City Library", books);
        lib.displayBooks();
        System.out.println("Sougata Kundu,24155737");
    }
}
