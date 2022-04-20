import java.util.ArrayList;

public class PRO2 {
    public static void main(String[] args) {
        Account account = new Account(1122, 1000.0);
        account.setName("George");
        account.setAnnualInterestRate(1.65);
        
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(30);
        account.withdraw(40);
        account.withdraw(50);
    
        System.out.println();
        System.out.printf("Name : %s\n",account.getName());
        System.out.printf("Account ID : %d\n",account.getId());
        System.out.printf("Interest rate : %.2f \n", account.getAnnualInterestRate());
        System.out.printf("Balance : %.2f\n\n", account.getBalance());
        
        System.out.println("Date                                             Type         Amount           Balance");     

        ArrayList<Transaction> transactions = account.getTransactions();
        for (Transaction trans : transactions) {
                            System.out.printf("%s                       %s          %.2f            %.2f \n",trans.getDate().toString(),trans.getType(),trans.getAmount(),trans.getBalance());
                                                     
        }
    }
}