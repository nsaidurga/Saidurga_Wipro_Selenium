package Day7;

/*
 13. Implement a BankAccount class accessed by multiple threads 
 to deposit and withdraw money. Use synchronization.
 */
class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient balance.");
        }
    }
}

public class BankThreadExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            account.deposit(500);
            account.withdraw(300);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            account.withdraw(700);
            account.deposit(200);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
/*
output:
Thread-1 deposited 500. Balance: 1500
Thread-1 withdrew 300. Balance: 1200
Thread-2 withdrew 700. Balance: 500
Thread-2 deposited 200. Balance: 700
*/