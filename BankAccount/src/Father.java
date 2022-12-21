class Father extends Thread {
    int amount;
    BankAccount BankAccountX;
    Father(BankAccount x, int amount){
        BankAccountX = x;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run(){
        BankAccountX.deposit(amount);
    }
}