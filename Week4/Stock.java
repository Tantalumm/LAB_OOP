public class Stock {
    private String symbol;
    private String name;

    private double previous;
    private double current;

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public void SetSymbol(String symbol)
    {
        this.symbol = symbol;
    }
    public String getSymbol(){
        return symbol;
    }

    public void Setname(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setCurrent(double current)
    {
        this.previous = this.current;
        this.current = current;
    }
    public double getCurrent()
    {
        return current;
    }

    public void  setPrevious(double previous){
        this.previous = previous;
    }
    public double getPrevious()
    {
        return previous;
    }
    
    public double getChangePercent()
    {
        return((current - previous) / previous)*100;
    }
}
