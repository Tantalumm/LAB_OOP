package Week2;

import java.util.Scanner;
public class Pro4_64010801 {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day of the month : ");
        int dayofmonth = input.nextInt();

        System.out.print("Enter month : ");
        int month = input.nextInt();

        System.out.print("Enter year : ");
        int year = input.nextInt();

        if (month == 1)
        {
            month = 13;
            year--;
        }
        else if (month == 2)
        {
            month = 14;
            year--;
        }
		int dayofweek = (dayofmonth + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7; 
        System.out.print("Day of the week is ");

        switch(dayofweek)
        {
            case 0 : System.out.println("Saturday"); 
            break;
            case 1 : System.out.println("Sunday"); 
            break;
            case 2 : System.out.println("Monday"); 
            break;
            case 3 : System.out.println("Tuesday"); 
            break;
            case 4 : System.out.println("Wednesday"); 
            break;
            case 5 : System.out.println("Thursday"); 
            break;
            case 6 : System.out.println("Friday"); 
        }


    }
    
}
