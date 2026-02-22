// 24. Polymorphism using arrays of parent-class references
class Shape {
    public void area() {
        System.out.println("Shape area");
    }
}

class Circle extends Shape {
    public void area() {
        System.out.println("Circle area = πr²");
    }
}

class Rectangle extends Shape {
    public void area() {
        System.out.println("Rectangle area = length × width");
    }
}

public class q24 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Shape();
        
        for (Shape s : shapes) {
            s.area();  // Polymorphic call
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
