public class CheckingAccount
		extends Account {
	
	private double overdraftLimit;
    private double setOverdraftLimit = -5000;

	
	public CheckingAccount(int Nid, double Nbalance, double NoverdraftLimit) {
		super(Nid, Nbalance);
		overdraftLimit = NoverdraftLimit;
	}

	public void setOverdraftLimit(double NoverdraftLimit) {
		overdraftLimit = NoverdraftLimit;
	}

	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	
	public void withdraw(double amount) {
		withdraw = amount;
		if (getBalance() - amount >= setOverdraftLimit) {
			setBalance(getBalance() - amount);
			Error = "";
		}
		else
			Error = "Error! Amount exceeds overdraft limit.";
	}

	
	public String toString() {
		return "\nOverdraft limit: $" + String.format("%.2f", overdraftLimit) + super.toString();
	}
}
