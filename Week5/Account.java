public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private java.util.Date toDay;

    public Account()
    {
       toDay = new java.util.Date();
    }

    public Account(int NId, double NBalance){
        this();
        id = NId;
        balance = NBalance;
    }

    //ID
    public int getId()
    {
        return id;

    }
    public void setId(int NId){
        id = NId;
    }

    //balance
    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double NBalance)
    {
        balance = NBalance;
    }

    //getAnnualInterrestRate
    public double getAnnualInterrestRate()
    {
        return annualInterestRate;
    }

    public void setAnnulInterestRate(Double NAnnualInterestRate)
    {
        annualInterestRate = NAnnualInterestRate;
    }

    //Date
    public String getDateCreated() 
    {
        return this.toDay.toString();
    }

    //MonthlyInterestRate
    public double getMonthlyInterestRate()
    {
        return (annualInterestRate/100) / 12;
    }

    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(int amount)
    {
        balance -= amount;
    }
    public void deposit(int amount)
    {
        balance += amount;
    }
}
