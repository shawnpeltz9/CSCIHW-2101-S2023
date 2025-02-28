package Project1;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("MOMO", 8675309);

        System.out.println(myAccount.name);

        BankAccount yourAccount = new BankAccount("Katara", 1234567, 10000, 101, "01/01/2000");

        System.out.println(yourAccount.name);

        System.out.println(yourAccount.getbalance());
        System.out.println(yourAccount.getdob());
        System.out.println(yourAccount.getssn());
        System.out.println(yourAccount.getaccountNumber());
        System.out.println("===========");

        System.out.println(myAccount.getbalance());
        System.out.println(myAccount.getdob());
        System.out.println(myAccount.getssn());
        System.out.println(myAccount.getaccountNumber());

        System.out.println("===========");
        myAccount.setdob("01/02/2000");
        System.out.println(myAccount.getdob());
        myAccount.setaccountNumber(102);
        System.out.println(myAccount.getaccountNumber());
        System.out.println("===========");
        System.out.println(myAccount.getbalance());
        // myAccount.balance = 1000000; // This does not work because balance is private
        myAccount.deposit(100);
        System.out.println(myAccount.getbalance());

        // yourAccount.deposit(100);
        System.out.println(yourAccount.getbalance());

        // int choice = BankAccount.menu();
        // System.out.println(choice);

        BankAccount.interact(yourAccount);
        // BankAccount.interact(myAccount);

        BankAccount.overDraft(yourAccount, 500);

        System.out.println("Before transfer:");
        System.out.println(myAccount.name + "'s account balance: $" + myAccount.getbalance());
        System.out.println(yourAccount.name + "'s account balance: $" + yourAccount.getbalance());

        BankAccount.transferMoney(myAccount, yourAccount, 100);

        double principal = 1000;
        double rate = 5; 
        double time = 2;
        double interest = simpleInterest(principal, rate, time);
        System.out.println("Simple interest: $" + interest);

    }
    private static double simpleInterest(double principal, double rate, double time) {
        return 0;
    } 
}
