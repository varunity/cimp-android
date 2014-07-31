

public class AssignmentTestAccounts
{
  public static void main(String[] args)
  {
    // create a checking account
    CheckingAccount checkingAccount = new CheckingAccount(0);
    SavingsAccount savingsAccount = new SavingsAccount(0);

    // deposit money into both accounts
    boolean resultOfCheckingDeposit = checkingAccount.deposit(100);
    boolean resultOfSavingsDeposit = savingsAccount.deposit(100);

    // report
    System.out.println("Checking Account: " + checkingAccount.balanceInquiry());
    System.out.println("Savings Account : " + savingsAccount.balanceInquiry());

    // attempt to withdraw from each account
    try {
    	checkingAccount.withdraw(150);
    	System.out.println("Successfully withdrew 150 from checking account (Account #" + checkingAccount.getNumber() + ") Balance is: " + checkingAccount.balanceInquiry() );
    	
	} catch (InvalidTransactionException e) {
		// TODO: handle exception
		System.out.println("Unsuccessful withdrawal of 150 from checking account (Account #" + checkingAccount.getNumber() + ")Balance is: " + checkingAccount.balanceInquiry() );
	}
    
    // attempt to withdraw from each account
 // attempt to withdraw from each account
    try {
    	savingsAccount.withdraw(150);
    	System.out.println("Successfully withdrew 150 from checking account (Account #" + checkingAccount.getNumber() + ") Balance is: " + checkingAccount.balanceInquiry() );
    	
	} catch (InvalidTransactionException e) {
		// TODO: handle exception
		System.out.println("Unsuccessful withdrawal of 150 from checking account (Account #" + checkingAccount.getNumber() + ")Balance is: " + checkingAccount.balanceInquiry() );
	}
    		
  }
}
