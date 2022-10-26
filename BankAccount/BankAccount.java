public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalAmount = 0.0;

    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts++; 
    }

    // public BankAccount() {
    //     this.checkingBalance = 0.0;
    //     this.savingsbalance = 0.0;
    //     numberOfAccounts++; 
    // }

    public static int accountsCount() {
        return numberOfAccounts;
    }

    public static double totalAmount() {
        return totalAmount;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void depositMoney(double amount, String account){
        if (account.equals("saving")){
            this.savingsBalance += amount; 
            System.out.println("Sucessfully added to Savings account");
        }
        else {
            this.checkingBalance += amount;
            System.out.println("Sucessfully added to Checking account");
        }
        totalAmount += amount;
    }

    public void withdrawMoney(double amount, String account) {
        if (account.equals("saving")){
            if (this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalAmount -= amount;
                System.out.println("Your account has shrunk.");
            }
            else {
                System.out.println("You don't have this much money");
            }
        }
        else {
            if (this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalAmount -= amount;
                System.out.println("Your account has shrunk.");
            }
            else {
                System.out.println("You don't have this much money");
            }
        }
    }

    public void getTotal() {
        System.out.println("Your money" + (this.checkingBalance + this.savingsBalance));
    }

    

}