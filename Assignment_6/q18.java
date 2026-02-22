// 18. Runtime polymorphism in multilevel inheritance
class Level1 {
    public void display() {
        System.out.println("Level 1");
    }
}

class Level2 extends Level1 {
    public void display() {
        System.out.println("Level 2");
    }
}

class Level3 extends Level2 {
    public void display() {
        System.out.println("Level 3");
    }
}

public class q18 {
    public static void main(String[] args) {
        Level1 obj1 = new Level3();
        Level1 obj2 = new Level2();
        Level1 obj3 = new Level1();
        
        obj1.display();
        obj2.display();
        obj3.display();
        System.out.println("Sougata Kundu , 24155737");
    }
}
