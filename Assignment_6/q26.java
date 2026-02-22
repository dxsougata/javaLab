// 26. Polymorphism with method parameters and return types
class Number {
    public Number getValue() {
        System.out.println("Number getValue");
        return new Number();
    }
}

class Integer extends Number {
    public Integer getValue() {
        System.out.println("Integer getValue (covariant return)");
        return new Integer();
    }
}

public class q26 {
    public static void main(String[] args) {
        Number num = new Integer();
        Number result = num.getValue();
        
        Integer intNum = new Integer();
        Integer intResult = intNum.getValue();
        System.out.println("Sougata Kundu , 24155737");
    }
}
