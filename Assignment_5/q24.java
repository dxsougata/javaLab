class Box {
    int length, width, height;
    
    Box() {
        this(5, 5, 5); // Calls parameterized constructor
        System.out.println("Default constructor");
    }
    
    Box(int side) {
        this(side, side, side); // Calls three-parameter constructor
        System.out.println("One parameter constructor");
    }
    
    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Three parameter constructor");
    }
}

public class q24 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10);
        System.out.println("Sougata Kundu,24155737");
    }
}
