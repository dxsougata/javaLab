class Book {
    String title;
    String author;
    double price;
    
    Book() {
        this("Unknown", "Unknown", 0.0);
    }
    
    Book(String title) {
        this(title, "Unknown", 0.0);
    }
    
    Book(String title, String author) {
        this(title, author, 0.0);
    }
    
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class q32 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java");
        Book b3 = new Book("Python", "Guido");
        Book b4 = new Book("C++", "Stroustrup", 500);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        System.out.println("Sougata Kundu,24155737");
    }
}
