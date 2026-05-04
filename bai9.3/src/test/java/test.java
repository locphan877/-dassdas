import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    void testWithdrawSuccess() {
        BankAccount account = new BankAccount("TEST01", 1000.0);
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance(), "So du phai con lai 500");
    }

    @Test
    void testWithdrawFail() {
        BankAccount account = new BankAccount("TEST02", 100.0);
        // Kiem tra xem co nem ra loi khi rut qua so du khong
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0);
        });
    }
}