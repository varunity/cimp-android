package scrapheap;

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
System.out.println("Checking Account: " +
checkingAccount.getBalance());
System.out.println("Savings Account : " +
savingsAccount.getBalance());
// attempt to withdraw from each account
boolean resultOfCheckingWithdrawal =
checkingAccount.withdraw(150);
// did this succeed or fail?
if (resultOfCheckingWithdrawal)
{
System.out.println("Successfully withdrew 150 from account 1. Balance is: " + checkingAccount.getBalance() );
}
else
{
System.out.println("Unsuccessful withdrawal of 150 from account 1. Balance is: " + checkingAccount.getBalance() );
}
// attempt to withdraw from each account
boolean resultOfSavingsWithdrawal =
savingsAccount.withdraw(150);
// did this succeed or fail?
if (resultOfSavingsWithdrawal)
{
System.out.println("Successfully withdrew 150 from account 2. Balance is: " + savingsAccount.getBalance() );
}
else
{
System.out.println("Unsuccessful withdrawal of 150 from account 2. Balance is: " + savingsAccount.getBalance() );
}
}
}
