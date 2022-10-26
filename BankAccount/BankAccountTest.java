public class BankAccountTest {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();
        BankAccount account5 = new BankAccount();

        BankAccount.accountsCount();

        account1.depositMoney(25.0,"saving");
        account1.depositMoney(25.0,"saving");
        account1.depositMoney(25.0,"checking");

        account1.withdrawMoney(25.0,"saving");
        account1.withdrawMoney(25.0,"saving");

        account1.withdrawMoney(25.0,"saving");
        account1.withdrawMoney(25.0,"saving");

        System.out.println("There are " + BankAccount.accountsCount() + " accounts");
        System.out.println("There is " + BankAccount.totalAmount() + "$");

    }
}
