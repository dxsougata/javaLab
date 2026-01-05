public class q38 {
    static class Elem { int val; }
    public static void main(String[] args){
        if (args.length < 2){ System.out.println("Usage: size elems..."); return; }
        int size = Integer.parseInt(args[0]);
        if (args.length-1 < size){ System.out.println("Not enough elements"); return; }
        Elem[] arr = new Elem[size];
        for (int i=0;i<size;i++){ arr[i] = new Elem(); arr[i].val = Integer.parseInt(args[i+1]); }
        for (int i=0;i<size;i++) System.out.println("Element " + i + ": " + arr[i].val);
        System.out.println("Sougata Kundu , 24155737");
    }
}
