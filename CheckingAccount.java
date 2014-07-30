package scrapheap;

public class CheckingAccount extends Account {

	public CheckingAccount(double bal) {
		super(bal);
		// TODO Auto-generated constructor stub
	}
	
	public boolean withdraw(double amount){
		
		double bal = this.getBalance();
		
		if (bal <= -100 ) {
			
			return false;
			
		} else {
			
			balance = bal - amount;
			return true;
		}

	}

}
