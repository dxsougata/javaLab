public class q04 {
    static class Book {
        String title;
        String author;
        int year;
        double price;
        
        Book(String title, String author, int year, double price) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.price = price;
        }
        
        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Price: " + price;
        }
    }
    
    public static void main(String[] args) {
        int n = 8;
        Book[] books = new Book[n];
        
        books[0] = new Book("Java Basics", "John Doe", 2015, 450);
        books[1] = new Book("Advanced Java", "Jane Smith", 2018, 650);
        books[2] = new Book("Web Development", "Bob Johnson", 2012, 550);
        books[3] = new Book("Python Programming", "Alice Brown", 2020, 480);
        books[4] = new Book("Data Structures", "Charlie Wilson", 2019, 720);
        books[5] = new Book("Algorithms", "Diana Martinez", 2021, 800);
        books[6] = new Book("Database Design", "Eve Davis", 2017, 620);
        books[7] = new Book("Cloud Computing", "Frank Miller", 2022, 750);
        
        int givenYear = 2018;
        
        System.out.println("Books published after " + givenYear + ":");
        for (Book book : books) {
            if (book.year > givenYear) {
                System.out.println(book);
            }
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
