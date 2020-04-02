package facade_pattern_package;
import java.util.*; 

public class BankService {
	
	private Hashtable<Integer, IAccount> bankAccounts;
	
	public BankService() {
		this.bankAccounts = new Hashtable<Integer, IAccount>();
		
	}
	
	public int createNewAccount(String type, Float initAmount) {
		IAccount newAccount = null;
		switch(type) {
			case "chequing"   : newAccount = new Chequing(initAmount); break;
			case "investment" : newAccount = new Investment(initAmount);break;
			case "saving" 	  : newAccount = new Saving(initAmount);break;
			default: System.out.println("Invalid account type"); break;
		}
		
		if (newAccount != null) {
			this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
			return newAccount.getAccountNumber();
		}
		
		return -1;
	}
	
	public float showBalance(int account) {
		IAccount myAccount = this.bankAccounts.get(account);
		return myAccount.showBalance();
	}
	
	public void transferMoney(int from, int to, Float amount) {		
		IAccount fromAccount = this.bankAccounts.get(from);
		IAccount toAccount = this.bankAccounts.get(to);
		
		fromAccount.transfer(toAccount, amount);
		
	}

}
