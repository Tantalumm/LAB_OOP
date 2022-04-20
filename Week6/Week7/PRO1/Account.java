import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double firstbalance;
	private static double annualInterestRate;
	private Date dateCreated;
	public  double withdraw;
	public  double deposit;
	public String Error;


	Account(int Nid, double Nbalance) {
		id = Nid;
		balance = Nbalance;
		firstbalance = Nbalance;
		dateCreated = new Date();
	}

	
	public void setId(int Nid) {
		id = Nid;
	}

	
	public void setBalance(double Nbalance) {
		balance = Nbalance;
	}

	
	public void setAnnualInterestRate(double NannualInterestRate) {
		annualInterestRate = NannualInterestRate;
	}

	public int getId() {
		return id;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	
	public String getDateCreated() {
		return dateCreated.toString();
	}

	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}


	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	
	public void withdraw(double amount) {
		withdraw = amount;
		if(balance - amount < 0)
        {
            Error = "There's not enough money in your account ;-; ";
        }
        else
        {
            balance -= amount;
			Error = "";
        }
		
	}

	
	
	public void deposit(double amount) {
		balance += amount;
	}

	
	public String toString() {
		return 
			  "\nBalance:  $" + String.format("%.2f", firstbalance)
			+ "\nWithdraw: $" + String.format("%.2f", withdraw)
			+ "\nBalance:  $" + String.format("%.2f", balance)
			+ String.format("\n%s",Error)
			+ "\nthis account was created at : " + getDateCreated();
			
	}
}