package facade_pattern_package;


public class Investment implements IAccount{
	private Float moneyAmount;
	private int accountNumber = 3;
	
	public Investment(Float amount) {
		this.moneyAmount = amount;
	}
	
	public void deposit(Float amount) {
		this.moneyAmount += amount;
	}
	
	public void withdraw(Float amount) {
		this.moneyAmount -= amount;		
	}
	
	public void transfer(IAccount to, Float amount) {
		withdraw(amount);
		to.deposit(amount);
	}
	
	@Override
	public Float showBalance() {
		return moneyAmount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

}
