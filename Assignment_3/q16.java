import java.util.*;

public class q16 {
    static class Player { String name; int score; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of players: ");
        int n = sc.nextInt();
        Player[] p = new Player[n];
        int sum=0, hi=Integer.MIN_VALUE; String top="";
        for (int i=0;i<n;i++){
            p[i]=new Player();
            System.out.print("Name: "); p[i].name = sc.next();
            System.out.print("Score: "); p[i].score = sc.nextInt();
            sum += p[i].score;
            if (p[i].score > hi) { hi = p[i].score; top = p[i].name; }
        }
        sc.close();
        System.out.println("Top scorer: " + top + " (" + hi + ")");
        System.out.println("Average: " + (n>0 ? (double)sum/n : 0));
        System.out.println("Sougata Kundu , 24155737");
    }
}
