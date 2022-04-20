import java.util.ArrayList;

class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account() {
        dateCreated = new java.util.Date();
        transactions = new ArrayList<Transaction>();
    }

    public Account(int Nid, double Nbalance) {
        this();
        id = Nid;
        balance = Nbalance;
    }
    
    public Account(int id, double balance, String n) {
        this(id, balance);
        name = n;
    }

    public String getName() {
        return name; 
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
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
        return this.dateCreated.toString();
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

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
        Transaction Save = new Transaction('W', amount, balance, "Withdraw");
        transactions.add(Save);
    }

    public void deposit(double amount) {
        balance += amount;
        Transaction Save = new Transaction('D', amount, balance, "Deposit");
        transactions.add(Save);
    }
}