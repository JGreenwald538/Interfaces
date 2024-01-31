public class Main {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount();
        ca.setKey(1234);
        ca.lock(1234);
        ca.unlock(1234);
        ca.locked();
        ca.lock(2345);
        ca.unlock(2345);
        ca.deposit(100);
        ca.withdraw(50);
        ca.printBalance();
    }
}
