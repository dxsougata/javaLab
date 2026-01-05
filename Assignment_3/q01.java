public class q01 {
    static class Student {
        String name;
        int rollNo;
        double marks1, marks2, marks3;
        
        Student(String name, int rollNo, double marks1, double marks2, double marks3) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks1 = marks1;
            this.marks2 = marks2;
            this.marks3 = marks3;
        }
        
        double getAverage() {
            return (marks1 + marks2 + marks3) / 3;
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        Student[] students = new Student[n];
        
        students[0] = new Student("Rahul", 101, 85, 90, 88);
        students[1] = new Student("Priya", 102, 92, 88, 95);
        students[2] = new Student("Amit", 103, 78, 82, 80);
        students[3] = new Student("Neha", 104, 95, 93, 96);
        students[4] = new Student("Vikas", 105, 88, 85, 87);
        
        Student topStudent = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].getAverage() > topStudent.getAverage()) {
                topStudent = students[i];
            }
        }
        
        System.out.println("Student with highest average marks:");
        System.out.println("Name: " + topStudent.name);
        System.out.println("Roll No: " + topStudent.rollNo);
        System.out.println("Average Marks: " + topStudent.getAverage());
        System.out.println("Sougata Kundu , 24155737");
    }
}
