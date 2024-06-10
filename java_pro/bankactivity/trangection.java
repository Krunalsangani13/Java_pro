package bankactivity;

public class trangection implements bank{

	public void withdrow(account acc, int amount) {
		
	}


	public void deposite(account acc, int amount) {
		int newbal=acc.getBalance()-amount;
		acc.setBalance(newbal);
		
		System.out.println("balance update");
	}
	
}
