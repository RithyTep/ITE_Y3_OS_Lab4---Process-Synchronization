class Son extends Thread {
    int amount;
    BankAccount BankAccountY;
    Son(BankAccount x, int amount){
        BankAccountY = x;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run(){
        BankAccountY.withdraw(amount);
    }
}