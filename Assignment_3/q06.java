public class q06 {

    static class Product {
        int productId;
        String name;
        double price;

        Product(int productId, String name, double price) {
            this.productId = productId;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "ID: " + productId + ", Name: " + name + ", Price: " + price;
        }
    }

    public static void main(String[] args) {
       
        Product[] products = new Product[] {
            new Product(1000, "Pen", 10.0),
            new Product(1001, "Notebook", 50.0),
            new Product(1002, "Pencil", 5.0),
            new Product(1001, "Diary", 120.0), 
            new Product(1003, "Marker", 25.0),
            new Product(1000, "Highlighter", 30.0),
            new Product(1004, "Eraser", 8.0)
        };

        System.out.println("All Products:");
        for (Product p : products) {
            System.out.println(p);
        }

        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        java.util.HashSet<Integer> duplicates = new java.util.HashSet<>();

        for (Product p : products) {
            if (!seen.add(p.productId)) {
                duplicates.add(p.productId);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("\nNo duplicate product IDs found.");
        } else {
            System.out.println("\nDuplicate product IDs detected:");
            for (Integer id : duplicates) {
                System.out.println("ID: " + id);
                for (Product p : products) {
                    if (p.productId == id) {
                        System.out.println("  -> " + p);
                    }
                }
            }
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
