public class q02 {
    private final String note;

   
    public q02(String note) {
        this.note = note;
    }

    public void show() {
        System.out.println("Final field set in constructor: " + note);
    }

    public static void main(String[] args) {
        q02 demo = new q02("Hello from constructor");
        demo.show();
        System.out.println("Sougata Kundu , 24155737");
    }
}
