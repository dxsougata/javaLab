public class q10 {
    static class Laptop{
        int ramSize;
        int price;
        String name;
        Laptop(int ramSize,int price,String name){
            this.price = price;
            this.ramSize = ramSize;
            this.name = name;
        }

        public String toString(){
            return "laptop : "+ name + " ram : "+ ramSize + " price " + price ;
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Number of laptops: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("No laptops provided.");
            sc.close();
            return;
        }

        Laptop minPrice = null;
        Laptop maxRam = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name model (single-token), RAM (int), price (int): ");
            String name = sc.next();
            int ram = sc.nextInt();
            int price = sc.nextInt();
            Laptop lap = new Laptop(ram, price, name);
            if (minPrice == null || lap.price < minPrice.price) minPrice = lap;
            if (maxRam == null || lap.ramSize > maxRam.ramSize) maxRam = lap;
        }

        sc.close();

        System.out.println("Laptop with minimum price: " + minPrice);
        System.out.println("Laptop with maximum RAM: " + maxRam);
        System.out.println("Sougata Kundu , 24155737");
    }
}
