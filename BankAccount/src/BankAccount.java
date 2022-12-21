class BankAccount {
    public int balance;
    void displayBalance() {
        System.out.println("Father's Balance: " + balance);
    }

    synchronized void deposit(int amount){
        balance = balance + amount;
        System.out.println( amount + " is deposited");
        displayBalance();
    }

    synchronized void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Son withdrawal:" + amount);
        displayBalance();
    }
}