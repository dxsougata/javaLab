class Q19 {
    int x;

    Q19(int a) {
        x = a;
    }

    public static void main(String[] args) {
       

        if (args.length > 0) {
            Q19 obj = new Q19(Integer.parseInt(args[0]));
            System.out.println(obj.x);
        } else {
            System.out.println("No command line argument given");
        }

        System.out.println("Sougata Kundu , 24155737");
    }
}
