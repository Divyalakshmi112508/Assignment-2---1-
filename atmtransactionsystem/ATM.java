/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmtransactionsystem;
import java.util.*;
/**
 *
 * @author acer
 */
public class ATM {
    private double balance = 10000;
    private final int correctPIN = 1234;

    // throws is used here
    public void verifyPIN(int pin) throws InvalidPINException {

        if (pin != correctPIN) {

            // throw is used here
            throw new InvalidPINException(
                "Invalid PIN! Please enter the correct PIN."
            );
        }

        System.out.println("PIN verified successfully.");
    }

    public void checkBalance() {

        System.out.println(
            "Available Balance: Rs." + balance
        );
    }

    // throws is used here
    public void deposit(double amount)
            throws InvalidAmountException {

        if (amount <= 0) {

            // throw is used here
            throw new InvalidAmountException(
                "Deposit amount must be greater than zero."
            );
        }

        balance = balance + amount;

        System.out.println(
            "Amount deposited successfully."
        );

        System.out.println(
            "New Balance: Rs." + balance
        );
    }

    // throws is used here
    public void withdraw(double amount)
            throws InvalidAmountException,
                   InsufficientBalanceException {

        if (amount <= 0) {

            // throw is used here
            throw new InvalidAmountException(
                "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {

            // throw is used here
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance = balance - amount;

        System.out.println(
            "Please collect your cash."
        );

        System.out.println(
            "Remaining Balance: Rs." + balance
        );
    }
}
    

