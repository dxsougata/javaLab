class Book {
    private String title;

    public Book(final String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book title: " + title);
    }
}

public class q06 {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        book.display();
        System.out.println("Sougata Kundu , 24155737");
    }
}
