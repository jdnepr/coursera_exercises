package facade_pattern_package;

public class Saving implements IAccount{
	
	private Float moneyAmount;
	private int accountNumber = 2;
	
	public Saving(Float amount) {
		this.moneyAmount = amount;	
	}
	
	@Override
	public void deposit(Float amount) {
		this.moneyAmount += amount;
	}
	
	@Override
	public void withdraw(Float amount) {
		this.moneyAmount -= amount;
	}
	
	@Override
	public void transfer(IAccount to, Float amount) {
		withdraw(amount);
		to.deposit(amount);
	}
	
	@Override
	public Float showBalance() {
		return moneyAmount;
	}
	
	@Override
	public int getAccountNumber() {
		return accountNumber;
		
	}

}
