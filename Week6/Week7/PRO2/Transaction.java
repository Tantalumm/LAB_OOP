public class Transaction {
    private java.util.Date mDate;
    private char Type;
    private double Amount;
    private double Balance;
    private String description;
    
    public Transaction(char Ntype, double Namount, double Nbalance ,String Ndescription) {
        Type = Ntype;
        Amount = Namount;
        Balance = Nbalance;
        description = Ndescription;
        mDate = new java.util.Date();
    }

    public char getType() {
        return Type;
    }
    
    public void setType(char Ntype) {
        Type = Ntype;
    }
    
    public double getAmount() {
        return Amount;
    } 
    
    public String getDescription()
    {
        return description;
    }
    
    public void setAmount(double Namount) {
        Amount = Namount;
    }

    public double getBalance() {
        return Balance;
    }

    
    public void setBalance(double Nbalance) {
        Balance = Nbalance;
    }
    
    public java.util.Date getDate() {
        return mDate;
    }
    
    
}