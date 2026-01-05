public class q03 {
    static class BankAccount {
        String accountHolder;
        String accountType; 
        double balance;
        
        BankAccount(String accountHolder, String accountType, double balance) {
            this.accountHolder = accountHolder;
            this.accountType = accountType;
            this.balance = balance;
        }
        
        @Override
        public String toString() {
            return "Account Holder: " + accountHolder + ", Type: " + accountType + ", Balance: " + balance;
        }
    }
    
    public static void main(String[] args) {
        int n = 7;
        BankAccount[] accounts = new BankAccount[n];
        
        accounts[0] = new BankAccount("Rajesh", "Savings", 50000);
        accounts[1] = new BankAccount("Meera", "Current", 100000);
        accounts[2] = new BankAccount("Vikram", "Savings", 75000);
        accounts[3] = new BankAccount("Nisha", "Savings", 125000);
        accounts[4] = new BankAccount("Aryan", "Current", 200000);
        accounts[5] = new BankAccount("Shruti", "Savings", 95000);
        accounts[6] = new BankAccount("Rohan", "Current", 150000);
        
        double totalSavingsBalance = 0;
        
        System.out.println("All Accounts:");
        for (BankAccount account : accounts) {
            System.out.println(account);
            if (account.accountType.equals("Savings")) {
                totalSavingsBalance += account.balance;
            }
        }
        
        System.out.println("\nTotal balance of all Savings accounts: " + totalSavingsBalance);
        System.out.println("Sougata Kundu , 24155737");
    }
}
