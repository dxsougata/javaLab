public class q31 {
    public static void main(String[] args) {
        if (args.length==0) { System.out.println("Provide integers as arguments"); return; }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (String a: args) {
            int v = Integer.parseInt(a);
            if (v>max) max=v; if (v<min) min=v;
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        System.out.println("Sougata Kundu , 24155737");
    }
}
