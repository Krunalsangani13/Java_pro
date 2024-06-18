package user_defind_exception;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
        System.out.print("Enter account name: ");
        String accName = ob.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = ob.nextDouble();
        
        BankAccount account = new BankAccount(accName, balance);
        System.out.println("Account created: " + account);
        System.out.print("Enter amount to withdraw: ");
        double amount = ob.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("Updated account details: " +account);
        } catch (balanceLowException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        ob.close();

	}

}
