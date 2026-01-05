import java.util.*;

public class q27 {
    static class Book { String title; boolean issued=false; }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of books: "); int n=sc.nextInt();
        Book[] lib = new Book[n];
        for (int i=0;i<n;i++){ lib[i]=new Book(); lib[i].title=sc.next(); }
        while (true) {
            System.out.println("1.Search 2.Issue 3.Return 4.Exit"); int c=sc.nextInt();
            if (c==4) break;
            System.out.print("Title: "); String t=sc.next();
            int idx = -1; for (int i=0;i<n;i++) if (lib[i].title.equals(t)) idx=i;
            if (c==1) {
                System.out.println(idx==-1?"Not found":"Found: " + lib[idx].title + ", Issued: " + lib[idx].issued);
            } else if (c==2) {
                if (idx==-1) System.out.println("Not found"); else if (lib[idx].issued) System.out.println("Already issued"); else { lib[idx].issued=true; System.out.println("Issued"); }
            } else if (c==3) {
                if (idx==-1) System.out.println("Not found"); else { lib[idx].issued=false; System.out.println("Returned"); }
            }
        }
        sc.close();
        System.out.println("Sougata Kundu , 24155737");
    }
}
