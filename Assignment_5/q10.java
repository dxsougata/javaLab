class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    int multiply(int a, int b) {
        return a * b;
    }
}

public class q10 {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Sougata Kundu,24155737");
    }
}
