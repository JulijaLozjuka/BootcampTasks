package tasks.wednesday11may.task3and4;

public class BankAccount {


/*3) create a class "BankAccount" with property "balance" (should be decimal number)
            * create empty default constructor for it
    * create a constructor with parameter for setting balance.
            * create a method "deposit" with one parameter "amount" (decimal number)
    which allows user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
            (decimal number) which allows user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another

 */

    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount>5000){
            System.out.printf("Transaction cancelled. Max deposit - 5000 | Your deposit: %f \n",amount);
            return;
        }
        balance+=amount;
        System.out.println("Successfully added " + amount);
    }
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("There is not enough funds");
            return;
        }
        balance-=amount;
        System.out.println("Successfully withdrew " + amount);

    }
    public void printBalance(){
        System.out.println(balance);
    }

    public void transferFrom(BankAccount source, double amount){
        if (amount> source.balance){
            System.out.printf( "Transfer cancelled. You are trying to transfer %f units, but only %f are available.\n"
            ,amount,source.balance);
            return;
        }
        this.balance+=amount;
        source.balance-=amount;
        System.out.println("Successfully transferred " + amount);
    }

    public double getBalance() {
        return balance;
    }

}
