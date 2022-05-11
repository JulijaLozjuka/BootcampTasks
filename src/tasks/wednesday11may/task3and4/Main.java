package tasks.wednesday11may.task3and4;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500.5);
        BankAccount anotherAccount = new BankAccount(350.8);
        System.out.println("myAccount balance: " + myAccount.getBalance());
        System.out.println("anotherAccount balance: " + anotherAccount.getBalance());
        double amount = 85.5;
        System.out.println("depositing money to myAccount, amount = "+ amount);
        myAccount.deposit(amount);
        System.out.println("current myAccount balance: " + myAccount.getBalance());
        System.out.println("trying to deposit more than 5000 to myAccount");
        myAccount.deposit(8000.55);
        System.out.println("current myAccount balance: " + myAccount.getBalance());
        System.out.println("want to withdraw " + amount);
        myAccount.withdraw(amount);
        System.out.println("current myAccount balance: " + myAccount.getBalance());
        System.out.println("trying to withdraw more than myAccount has in balance");
        myAccount.withdraw(myAccount.getBalance()+100);
        System.out.println("current myAccount balance: " + myAccount.getBalance());
        System.out.println("transfer from anotherAccount to myAccount");
        myAccount.transferFrom(anotherAccount,amount);
        System.out.println("myAccount balance: " + myAccount.getBalance());
        System.out.println("anotherAccount balance: " + anotherAccount.getBalance());
        System.out.println("trying transfer more than anotherAccount has");
        myAccount.transferFrom(anotherAccount, anotherAccount.getBalance()+500);
        System.out.println("myAccount balance: " + myAccount.getBalance());
        System.out.println("anotherAccount balance: " + anotherAccount.getBalance());



    }
}
