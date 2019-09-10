package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		try {
			bank.deposit(10000);
		} catch(DepositException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
