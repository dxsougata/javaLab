public class q37 {
    public static void main(String[] args){
        if (args.length==0){ System.out.println("Provide salaries as args"); return; }
        double sum=0; double[] s = new double[args.length];
        for (int i=0;i<args.length;i++){ s[i]=Double.parseDouble(args[i]); sum+=s[i]; }
        double avg = sum/ s.length;
        for (double v: s) if (v>avg) System.out.println(v);
        System.out.println("Sougata Kundu , 24155737");
    }
}
