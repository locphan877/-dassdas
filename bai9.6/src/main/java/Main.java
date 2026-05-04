package com.uet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private double balance = 0;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logger.info("Nap tien thanh cong: {}", amount);
        } else {
            logger.warn("So tien nap phai lon hon 0");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            logger.info("Rut tien thanh cong: {}", amount);
            return true;
        }
        logger.error("Rut tien that bai: So du khong du hoac so tien khong hop le");
        return false;
    }

    public double getBalance() {
        return balance;
    }
}