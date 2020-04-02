package facade_pattern_package;

public class Main {

	public static void main(String[] args) {
		BankService myBankService = new BankService();
		int mySaving = myBankService.createNewAccount("saving", 800.00f);
		System.out.println(myBankService.showBalance(mySaving));
		
		int myInvestment = myBankService.createNewAccount("investment", 100.00f);
		System.out.println(myBankService.showBalance(myInvestment));
		
		myBankService.transferMoney(mySaving, myInvestment, 300.00f);
		System.out.println(myBankService.showBalance(mySaving));
		System.out.println(myBankService.showBalance(myInvestment));

	}

}
