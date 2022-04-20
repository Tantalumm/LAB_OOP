package Week2;

import java.util.Scanner;
public class Pro1_64010801 {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int NumDay = input.nextInt();
        System.out.printf("Enter the number of days elapsed since today : ");
        int NextDay = input.nextInt();

        input.close();
        
        int FutureDay = (NumDay + NextDay) % 7;
        String TheDay = "";
        
        if(NumDay == 0)
        {TheDay = "Sunday";}
        else if(NumDay == 1)
        {TheDay = "Monday";}
        else if(NumDay == 2)
        {TheDay = "Tuesday";}
        else if(NumDay == 3)
        {TheDay = "Wednesday";}
        else if(NumDay == 4)
        {TheDay = "Thursday";}
        else if(NumDay == 5)
        {TheDay = "Friday";}
        else if(NumDay == 6)
        {TheDay = "Saturday";}
        else if (0 >= NumDay|| NumDay >= 7)
        {TheDay = "ERROR";}

    if(0 >= NumDay || NumDay >= 7)
    {System.out.printf("%s",TheDay);}
    else if(FutureDay == 0)
    {System.out.printf("Today is %s and the future day is Sunday",TheDay);}
    else if(FutureDay == 1)
    {System.out.printf("Today is %s and the future day is Monday",TheDay);}
    else if(FutureDay == 2)
    {System.out.printf("Today is %s and the future day is Tuesday",TheDay);}
    else if(FutureDay == 3)
    {System.out.printf("Today is %s and the future day is Wednesday",TheDay);}
    else if(FutureDay == 4)
    {System.out.printf("Today is %s and the future day is Thursday",TheDay);}
    else if(FutureDay == 5)
    {System.out.printf("Today is %s and the future day is Friday",TheDay);}
    else if(FutureDay == 6)
    {System.out.printf("Today is %s and the future day is Saturday",TheDay);}
  
    }
    
}
