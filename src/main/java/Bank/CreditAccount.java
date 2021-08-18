package Bank;

class CreditAccount extends Account {
    private double intRate;
    private double creditLimit;

    public CreditAccount(String ID, String name, double balance, double intRate, double creditLimit)
    {
        super(ID, name, balance);
        this.intRate = intRate;
        this.creditLimit = creditLimit;
    }
    public void chargeInterest() {
    	double interest = getBalance() * intRate / 100.0;
        deposit(interest);
    }
}
