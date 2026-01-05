// Create a Person class and find the oldest and youngest person.
public class q11 {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter number of persons: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Expected an integer.");
            sc.close();
            return;
        }
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("No persons to process.");
            sc.close();
            return;
        }

        Person oldest = null;
        Person youngest = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and age: ");
            String name = sc.next();
            if (!sc.hasNextInt()) {
                System.out.println("Invalid age. Skipping this entry.");
                sc.nextLine();
                continue;
            }
            int age = sc.nextInt();

            Person p = new Person(name, age);

            if (oldest == null || p.getAge() > oldest.getAge()) {
                oldest = p;
            }
            if (youngest == null || p.getAge() < youngest.getAge()) {
                youngest = p;
            }
        }

        sc.close();

        if (oldest != null && youngest != null) {
            System.out.println("Oldest: " + oldest.getName() + " (" + oldest.getAge() + ")");
            System.out.println("Youngest: " + youngest.getName() + " (" + youngest.getAge() + ")");
        } else {
            System.out.println("No valid person data provided.");
        }
        System.out.println("Sougata Kundu  , 24155737");
    }
    
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
