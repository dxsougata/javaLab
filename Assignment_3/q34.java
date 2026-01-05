public class q34 {
    public static void main(String[] args) {
        if (args.length != 3) { System.out.println("Usage: num1 operator num2"); return; }
        double a = Double.parseDouble(args[0]);
        String op = args[1];
        double b = Double.parseDouble(args[2]);
        switch (op) {
            case "+": System.out.println(a+b); break;
            case "-": System.out.println(a-b); break;
            case "*": System.out.println(a*b); break;
            case "/": System.out.println(b!=0 ? a/b : "Division by zero"); break;
            default: System.out.println("Unknown operator");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
