package com.uet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testDepositSuccess() {
        Main bank = new Main();
        bank.deposit(100.5);
        assertEquals(100.5, bank.getBalance());
    }

    @Test
    void testDepositInvalid() {
        Main bank = new Main();
        bank.deposit(-50);
        assertEquals(0, bank.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        Main bank = new Main();
        bank.deposit(200);
        boolean result = bank.withdraw(150);
        assertTrue(result);
        assertEquals(50, bank.getBalance());
    }

    @Test
    void testWithdrawFail() {
        Main bank = new Main();
        bank.deposit(100);
        // Rút quá số dư
        boolean result = bank.withdraw(150);
        assertFalse(result);
        assertEquals(100, bank.getBalance());
    }

    @Test
    void testWithdrawNegative() {
        Main bank = new Main();
        // Rút số âm
        boolean result = bank.withdraw(-20);
        assertFalse(result);
    }
}