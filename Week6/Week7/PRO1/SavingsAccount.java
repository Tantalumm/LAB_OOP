public class SavingsAccount 
    		extends Account {	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double amount) {
		withdraw = amount;
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
			Error = "";
		}
		else
			Error = "Error Saving Account can't be overdrawn!";
	}
}
