package scrapheap;

public class SavingsAccount extends Account{

	public SavingsAccount(double bal) {
		super(bal);
		// TODO Auto-generated constructor stub
	}
	
	public boolean withdraw(double amount){
		
		double bal = this.getBalance();
		
		if (bal <= 0 && bal > amount) {
			
			return false;
			
		} else {
			
			balance = bal - amount;
			return true;
		}

	}


}
