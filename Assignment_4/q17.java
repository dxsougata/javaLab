class Q17 {
    static int count = 0;

    Q17() {
        count++;
    }

    public static void main(String[] args) {
        
        new Q17();
        new Q17();

        System.out.println("Objects created: " + count);
        System.out.println("Sougata Kundu , 24155737");
    }
}
