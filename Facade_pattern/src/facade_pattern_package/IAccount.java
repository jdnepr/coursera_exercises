package facade_pattern_package;

public interface IAccount {

	public void deposit(Float amount);
	public void withdraw(Float amount);
	public void transfer(IAccount to, Float amount);
	public int getAccountNumber();
	public Float showBalance();
	

}
