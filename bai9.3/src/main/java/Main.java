import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Class logic để test
class BankAccount {
    private String id;
    private double balance;
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            logger.warn("Account {}: Rut tien that bai - So du khong du", id);
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        logger.info("Account {}: Rut thanh cong {}", id, amount);
    }

    public double getBalance() {
        return balance;
    }
}

// Class chính để chạy chương trình
public class Main {
    public static void main(String[] args) {
        System.out.println("Bank System is running...");
        BankAccount account = new BankAccount("LOC-VNU", 1000.0);
        account.withdraw(200.0);
        System.out.println("Balance: " + account.getBalance());
    }
}