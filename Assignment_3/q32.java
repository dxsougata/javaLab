public class q32 {
    public static void main(String[] args) {
        if (args.length==0) { System.out.println("Provide numbers as args"); return; }
        double sum=0; int count=0;
        for (String s: args) { double v = Double.parseDouble(s); sum+=v; count++; }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum/count));
        System.out.println("Sougata Kundu , 24155737");
    }
}
