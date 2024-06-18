package user_defind_exception;

public class balanceLowException extends Exception{
	
	public balanceLowException() {
		super("balance is too low for the withdrawal.");
	}
	
	public balanceLowException(String msg) {
		super(msg);
	}
}
