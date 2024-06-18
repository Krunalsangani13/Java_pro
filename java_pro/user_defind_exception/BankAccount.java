package user_defind_exception;

public class BankAccount {
	private String accName;
    private double balance;
    
	public BankAccount(String accName, double balance) {
		this.accName = accName;
		this.balance = balance;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accName=" + accName + ", balance=" + balance + "]";
	}
    
    
	public void withdraw(double amount) throws balanceLowException{
		if(balance-amount<1000) {
			throw new balanceLowException("balance after withdrawal should not be less then 1000.");
		}
		balance=balance-amount;
	}
    
}
