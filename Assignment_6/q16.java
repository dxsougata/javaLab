// 16. Dynamic method dispatch using parent reference and child object
class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing square");
    }
}

public class q16 {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Shape();
        
        shape1.draw();  // Calls Circle's draw()
        shape2.draw();  // Calls Square's draw()
        shape3.draw();  // Calls Shape's draw()
        System.out.println("Sougata Kundu , 24155737");
    }
}
