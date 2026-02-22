class Student {
    String name;
    int roll;
    
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    
    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }
}

class Classroom {
    Student[] students; // Array of objects
    
    Classroom(Student[] students) {
        this.students = students;
    }
    
    void displayAll() {
        System.out.println("Students in classroom:");
        for (Student s : students) {
            s.display();
        }
    }
}

public class q36 {
    public static void main(String[] args) {
        Student[] arr = {
            new Student("Alice", 101),
            new Student("Bob", 102),
            new Student("Charlie", 103)
        };
        Classroom c = new Classroom(arr);
        c.displayAll();
        System.out.println("Sougata Kundu,24155737");
    }
}
