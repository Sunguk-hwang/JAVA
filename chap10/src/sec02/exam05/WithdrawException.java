package sec02.exam05;

public class WithdrawException extends RuntimeException {
	
	//field
	
	
	//constructor
	public WithdrawException(){
		super("출금 문제");
	}
	public WithdrawException(String message) {
		super(message);
	}
	
	//method

	
}
