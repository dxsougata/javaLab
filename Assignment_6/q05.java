class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class q05 {
    public static void main(String[] args) {
        final Person p = new Person("Sougata");

        System.out.println("Initial name: " + p.getName());

        p.setName("Bob");
        System.out.println("After modification: " + p.getName());

        System.out.println("Sougata Kundu , 24155737");
    }
}
