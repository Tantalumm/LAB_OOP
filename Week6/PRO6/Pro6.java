package PRO6;
import java.util.Scanner;

import Account;
public class Pro6 {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 1; i < 11; i++) {
            accounts[i - 1] = new Account(i, 1000.0);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an id : ");
        int id = input.nextInt();
        
        if (id < 1 || id > 10) {
            id = incorrectId(id);
        }

        while (true) {
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            if (choice == 4) {
                System.out.printf("%nEnter an id : ");
                id = input.nextInt();

                if (id < 1 || id > 10) {
                    id = incorrectId(id);
                }
            }
            performChoice(id, choice, accounts);
        }
    }

    public static int incorrectId(int id) {
        Scanner input = new Scanner(System.in);
        while (id < 1 || id > 10) {
            System.out.print("Please enter a valid id: ");
            id = input.nextInt();
            System.out.println();
        }
        return id;
    }

    public static void performChoice(int id, int choice, Account[] accounts) {
        Scanner input = new Scanner(System.in);
        switch (choice) {
            case 1: 
                System.out.printf("The balance is $%.1f%n",accounts[id - 1].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id - 1].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id - 1].deposit(input.nextDouble());
                break;
            default:
                break;
        }
    }

    public static void menuDisplay() {
        System.out.printf(" Main menu \n");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
    
}
