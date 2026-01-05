import java.util.*;

public class q21 {
    static class Book { String title, author; public boolean equals(Object o){ if (!(o instanceof Book)) return false; Book b=(Book)o; return title.equals(b.title); } public int hashCode(){ return title.hashCode(); } }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of books in first array: "); int n1 = sc.nextInt();
        Set<Book> set = new LinkedHashSet<>();
        for (int i=0;i<n1;i++){ Book b=new Book(); b.title=sc.next(); b.author=sc.next(); set.add(b);} 
        System.out.print("Number of books in second array: "); int n2 = sc.nextInt();
        for (int i=0;i<n2;i++){ Book b=new Book(); b.title=sc.next(); b.author=sc.next(); set.add(b);} 
        sc.close();
        System.out.println("Merged books:");
        for (Book b: set) System.out.println(b.title + " - " + b.author);
        System.out.println("Sougata Kundu , 24155737");
    }
}
