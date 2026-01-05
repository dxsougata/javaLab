public class q35 {
    static boolean isPrime(int n){ if (n<2) return false; for (int i=2;i*i<=n;i++) if (n%i==0) return false; return true; }
    public static void main(String[] args){ if (args.length==0){ System.out.println("Provide numbers as args"); return;} for (String s: args){ int v=Integer.parseInt(s); if (isPrime(v)) System.out.println(v); } System.out.println("Sougata Kundu , 24155737"); }
}
