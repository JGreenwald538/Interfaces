public class CheckingAccount extends Account implements Lockable{
    private int key;
    private boolean locked;
    private int balance;
    public void lock(int key) {
        if(key == this.key) {
            System.out.println("Account Locked");
            locked = true;
        } else {
            System.out.println("Incorrect key");
        }
    }
    public void unlock(int key) {
        if(key == this.key) {
            System.out.println("Account Unlocked");
            locked = false;
        } else {
            System.out.println("Incorrect key");
        }
    }
    public boolean locked() {
        System.out.println("Checking if account is locked");
        return locked;
    }
    public void setKey(int key) {
        System.out.println("Setting key to " + key);
        this.key = key;
    }
    public void deposit(double amount) {
        if(!locked) {
            balance += amount;
            System.out.println("Depositing $" + amount);
        } else {
            System.out.println("Account is locked");
        }  
    }
    public void withdraw(double amount) {
        if(!locked) {
            balance -= amount;
            System.out.println("Withdrawing $" + amount);
        } else {
            System.out.println("Account is locked");
        }
    }
    public void printBalance() {
        System.out.println("Balance: $" + balance);
    }
}
