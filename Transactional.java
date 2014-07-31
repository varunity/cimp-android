

interface Transactional {
	boolean deposit(double amount);
	void withdraw(double amount) throws InvalidTransactionException;
	double balanceInquiry();
}

class InvalidTransactionException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Parameterless Constructor
    public InvalidTransactionException() {}

    //Constructor that accepts a message
    public InvalidTransactionException(String message)
    {
       super(message);
    }		
}