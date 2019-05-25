package Quesion_3;

public class Account {

	private double balance;
	
	private String accountNo;

	public Account( String accountNo) {
		
//		this.balance = balance;
		this.accountNo = accountNo;
	};
	
	public void deposit(double amount) {
		
		balance = balance + amount;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		
		if(balance >= amount) {
			
			balance = balance - amount;
		}
		
		else {
			
			throw new InsufficientBalanceException(balance);
			
		}
	}
	
	public double getBalance() {
		
		return balance;
	}
}
