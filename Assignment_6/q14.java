// 14. Initialize instance variables using an instance initializer block
public class q14 {
    int[] numbers;
    String message;
    
    {
        numbers = new int[]{1, 2, 3, 4, 5};
        message = "Initialized in initializer block";
        System.out.println("Instance variables initialized");
    }
    
    public q14() {
        System.out.println("Constructor called");
    }
    
    public static void main(String[] args) {
        q14 obj = new q14();
        System.out.println("Message: " + obj.message);
        System.out.println("First number: " + obj.numbers[0]);
        System.out.println("Sougata Kundu , 24155737");
    }
}
