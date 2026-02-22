class Calculator {
    int result = 0;
    
    Calculator add(int num) {
        result += num;
        return this;
    }
    
    Calculator subtract(int num) {
        result -= num;
        return this;
    }
    
    Calculator multiply(int num) {
        result *= num;
        return this;
    }
    
    void showResult() {
        System.out.println("Result: " + result);
    }
}

public class q28 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10).subtract(5).multiply(3).showResult();
        System.out.println("Sougata Kundu,24155737");
    }
}
