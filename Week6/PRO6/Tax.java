package PRO6;
public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW= 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;

    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int NFilingStatus) {
        filingStatus = NFilingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] NBrackets) {
        brackets = NBrackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] NRates) {
        rates = NRates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double NTaxableIncome) {
        taxableIncome = NTaxableIncome;
    }

    public double getTax() {
        double tax;
        if (taxableIncome <= brackets[filingStatus][0]) 
        {
            return Math.round(taxableIncome * rates[0]);
        }

        tax = brackets[filingStatus][0] * rates[0];

        for (int i = 1; i < brackets[filingStatus].length; i++) 
        {

            if (taxableIncome > brackets[filingStatus][i]) 
            {
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            } 
            else
            {
                return Math.round(tax + (taxableIncome - brackets[filingStatus][i - 1]) * rates[i]);
            }
        }
        return Math.round(tax + (taxableIncome - brackets[filingStatus][4]) * rates[5]);
    }
    
}
