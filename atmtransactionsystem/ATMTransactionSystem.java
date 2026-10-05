/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmtransactionsystem;
import java.util.*;
/**
 *
 * @author acer
 */
public class ATMTransactionSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        try {

            System.out.println("==============================");
            System.out.println("     ATM TRANSACTION SYSTEM");
            System.out.println("==============================");

            // PIN verification
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            atm.verifyPIN(pin);

            int choice;

            do {

                System.out.println("\n--------- ATM MENU ---------");
                System.out.println("1. Balance Enquiry");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                try {

                    switch (choice) {

                        case 1:
                            atm.checkBalance();
                            break;

                        case 2:
                            System.out.print(
                                "Enter deposit amount: Rs."
                            );

                            double deposit = sc.nextDouble();

                            atm.deposit(deposit);
                            break;

                        case 3:
                            System.out.print(
                                "Enter withdrawal amount: Rs."
                            );

                            double withdrawal = sc.nextDouble();

                            atm.withdraw(withdrawal);
                            break;

                        case 4:
                            System.out.println(
                                "Thank you for using ATM."
                            );
                            break;

                        default:
                            System.out.println("Invalid menu choice.");
                                
                            
                    }

                } catch (InvalidAmountException e) {

                    System.out.println("Transaction Error: " + e.getMessage());
                       
                    

                } catch (InsufficientBalanceException e) {

                    System.out.println("Transaction Error: " + e.getMessage());
                       
                    
                }

            } while (choice != 4);

        } catch (InvalidPINException e) {

            System.out.println("Login Error: " + e.getMessage());

                

        } catch (Exception e) {

            System.out.println("Unexpected Error: " + e.getMessage());
                
            

        } finally {

            // finally is used here
            System.out.println("\nATM session closed.");
               
            

            sc.close();
        }
    }
}
        // TODO code application logic here
    
    

