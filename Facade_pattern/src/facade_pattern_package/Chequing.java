package facade_pattern_package;

public class Chequing implements IAccount {
	private Float moneyAmount;
	private int accountNumber = 1;
	
	public Chequing(Float amount) {
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
