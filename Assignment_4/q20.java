class BankAccount {
    double balance;

    BankAccount() {
        balance = 1000;
    }

    BankAccount(double amt) {
        if (amt >= 1000) {
            balance = amt;
        } else {
            balance = 1000;
        }
    }
}

class Q20 {
    int x;

    Q20(int a) {
        x = a;
    }

    public static void main(String[] args) {

        Q20 obj = new Q20(10);
        System.out.println(obj.x);

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(500);
        BankAccount b3 = new BankAccount(5000);

        System.out.println(b1.balance);
        System.out.println(b2.balance);
        System.out.println(b3.balance);

        System.out.println("Sougata Kundu , 24155737");
    }
}
