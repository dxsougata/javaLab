public class q15 {
    private int age;
    private double marks;

    public q15(int age, double marks) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0. Given: " + age);
        }
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100. Given: " + marks);
        }
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Age: " + age + ", Marks: " + marks;
    }

    public static void main(String[] args) {
        // Valid object
        q15 s1 = new q15(18, 85.5);
        System.out.println("Valid student -> " + s1);

        // Invalid age example (will throw)
        try {
            new q15(-5, 70);
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid age -> " + ex.getMessage());
        }

        // Invalid marks example (will throw)
        try {
            new q15(20, 150);
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid marks -> " + ex.getMessage());
        }

        System.out.println("Sougata Kundu , 24155737");
    }
}