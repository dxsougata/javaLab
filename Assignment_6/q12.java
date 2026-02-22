// 12. Multiple instance initializer blocks and their execution order
public class q12 {
    int x;
    
    {
        System.out.println("Initializer block 1");
        x = 10;
    }
    
    {
        System.out.println("Initializer block 2");
        x = 20;
    }
    
    public q12() {
        System.out.println("Constructor, x = " + x);
    }
    
    public static void main(String[] args) {
        System.out.println("Creating object:");
        q12 obj = new q12();
        System.out.println("Sougata Kundu , 24155737");
    }
}
