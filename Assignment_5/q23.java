class Student {
    int roll;
    String name;
    
    Student(int roll, String name) {
        this.roll = roll; // this differentiates instance variable from parameter
        this.name = name;
    }
    
    void display() {
        System.out.println("Roll: " + this.roll);
        System.out.println("Name: " + this.name);
    }
}

public class q23 {
    public static void main(String[] args) {
        Student s = new Student(101, "John");
        s.display();
        System.out.println("Sougata Kundu,24155737");
    }
}
