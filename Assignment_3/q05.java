public class q05 {
    static class Car {
        String brand;
        String model;
        int year;
        double price;
        
        Car(String brand, String model, int year, double price) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
        }
        
        @Override
        public String toString() {
            return "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: " + price;
        }
    }
    
    public static void main(String[] args) {
        int n = 10;
        Car[] cars = new Car[n];
        
        cars[0] = new Car("Toyota", "Corolla", 2020, 800000);
        cars[1] = new Car("Honda", "Civic", 2019, 950000);
        cars[2] = new Car("Toyota", "Camry", 2021, 1200000);
        cars[3] = new Car("Maruti", "Swift", 2020, 650000);
        cars[4] = new Car("Hyundai", "i20", 2018, 700000);
        cars[5] = new Car("Toyota", "Fortuner", 2021, 2500000);
        cars[6] = new Car("Maruti", "Ertiga", 2019, 900000);
        cars[7] = new Car("Honda", "CR-V", 2020, 1800000);
        cars[8] = new Car("Toyota", "Innova", 2022, 1600000);
        cars[9] = new Car("Hyundai", "Creta", 2021, 1100000);
        
        String targetBrand = "Toyota";
        int count = 0;
        
        System.out.println("All Cars:");
        for (Car car : cars) {
            System.out.println(car);
        }
        
        System.out.println("\nCars of brand '" + targetBrand + "':");
        for (Car car : cars) {
            if (car.brand.equals(targetBrand)) {
                System.out.println(car);
                count++;
            }
        }
        
        System.out.println("\nTotal count of " + targetBrand + " cars: " + count);
        System.out.println("Sougata Kundu , 24155737");
    }
}
