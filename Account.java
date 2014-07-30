package scrapheap;

public class Account {

		protected static int account_number = 1;
		protected static double balance;
		
		//constructor
		public Account(double bal){
			
			this.account_number++;
			this.balance = bal;

		}
		// deposit method - only accept positive deposits

		public boolean deposit(double amount){
			
			this.balance = amount;
			
			return true;
		}
		
		// get balance - return current balance
		public double getBalance (){
			return balance;
		}
		
		public int getAccountNumber(){
			return this.account_number;
		}
		
		public void setAccountNumber(){
			account_number++;
		}

}
