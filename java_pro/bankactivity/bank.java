package bankactivity;

public interface bank {
	
	int min_balance=1000;
	
	void withdrow(account acc,int amount);
	
	void deposite(account acc,int amount);
}
