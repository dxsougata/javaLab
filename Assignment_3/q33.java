public class q33 {
    public static void main(String[] args) {
        if (args.length < 3) { System.out.println("Usage: name roll marks..."); return; }
        String name = args[0];
        String roll = args[1];
        int sum=0; for (int i=2;i<args.length;i++) sum += Integer.parseInt(args[i]);
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Total Marks: " + sum);
        System.out.println("Sougata Kundu , 24155737");
    }
}
