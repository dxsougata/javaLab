// 5. Demonstrate method overriding and runtime polymorphism using inheritance.

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class q05 {
    public static void main(String[] args){
        Shape s = new Circle();   
        s.draw();
        System.out.println("Sougata Kundu,24155737");
    }
}

