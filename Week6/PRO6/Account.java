package PRO6;
public class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int NId, double NBalance) {
        this();
        id = NId;
        balance = NBalance;
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

    public void setId(int NId) {
        id = NId;
    }

    public void setBalance(double NBalance) {
        balance = NBalance;
    }

    public void setAnnualInterestRate(double NAnnualInterestRate) {
        annualInterestRate = NAnnualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if(balance - amount < 0)
        {
            System.out.println("There's not enough money in your account ;-; ");
        }
        else
        {
            balance -= amount;
        }
        
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
