public class Main {
    public static void main(String[] args) {
        BankAccount ABC = new BankAccount();
        ABC.balance = 1000;
        Father t1;
        Son t2;
        t1 = new Father(ABC, 500);
        t2 = new Son(ABC,900);
    }
}