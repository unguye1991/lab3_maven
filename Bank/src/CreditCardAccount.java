class CreditCardAccount extends Account {
	    private double intRate;
	    private double creditLimit;

	    public CreditCardAccount(String ID, String name, double balance, double intRate, double creditLimit)
	    {
	        super(ID, name, balance);
	        this.intRate = intRate;
	        this.creditLimit = creditLimit;
	    }
	    public void chargeInterest() {
	    	double interest = getBalance() * intRate / 100.0;
	        deposit(interest);
	    //the balance variable that the student created only exists in the local scope and is discarded everytime, that's why the interest isnt added to the balance
	    }
}