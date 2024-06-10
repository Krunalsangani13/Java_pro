package bankactivity;

public class account {
	
	private String accountname,email;
	private int balance;
	
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "account [accountname=" + accountname + ", email=" + email + ", balance=" + balance + "]";
	}
		

}
