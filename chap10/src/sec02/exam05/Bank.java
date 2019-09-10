package sec02.exam05;

public class Bank {
	
	//field
	int balance;
	
	//constructor
	
	
	//method
	public void deposit(int amount) throws DepositException { // 2. 예외 호출한 곳에서 처리하도록 짬처리 한다.
		if(amount > 0) {
			balance += amount;
		} else {
			//예금 예외 발생
			throw new DepositException("예금 문제: 음수 예금 불가"); // 1. 예외를 발생시킬 떄
		}
	}
	
	public void withdraw(int amount) throws WithdrawException { // 2. 예외 호출한 곳에서 처리하도록 짬처리 한다.
		if(balance < amount) {
			balance -= amount;
		} else {
			//출금 예외 발생
			throw new WithdrawException("잔액 부족"); // 1. 예외를 발생시킬 떄
		}
	}
}
