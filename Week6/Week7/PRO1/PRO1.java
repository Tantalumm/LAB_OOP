public class PRO1 {
    public static void main(String[] args) {

		Account account = new Account(1122, 5000);
		SavingsAccount savings = new SavingsAccount(1001, 5000);
		CheckingAccount checking = new CheckingAccount(1004, 5000, 5000);

		// Withdraw $10,000
		account.withdraw(10000);
		
		checking.withdraw(10000);

        savings.withdraw(10000);

		// Deposit $3,000
		//account.deposit(3000);

		//checking.deposit(3000);

		//savings.deposit(3000);

		
		// Account
        System.out.println("\nAccount");
		System.out.println(account.toString());

		//Checking Account
        System.out.println("\nChecking Account");
        System.out.println(checking.toString());

		//Saving Account
        System.out.println("\nSaving Account");
        System.out.println(savings.toString());

        
	}
}
