package Week2;

import java.util.Scanner;
public class Pro4_64010801 {
    public static void main (String[] arg)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city : ");
        String cityfirst = input.nextLine();
        System.out.print("Enter the second city : ");
        String citysecond = input.nextLine();
        System.out.print("Enter the third city : ");
        String citythird = input.nextLine();
        input.close();
        
       String Space;
        if((citysecond.compareToIgnoreCase(cityfirst) < 0) && (citysecond.compareToIgnoreCase(citythird) < 0))
        {
            Space = cityfirst; cityfirst = citysecond; citysecond = Space;
        }
        if ((citythird.compareToIgnoreCase(cityfirst) < 0) && (citythird.compareToIgnoreCase(citysecond) < 0))
        {
            Space = cityfirst; cityfirst = citythird; citythird = Space;

        }
        if (citythird.compareToIgnoreCase(citysecond) < 0)
        {
            Space = citysecond; citysecond = citythird; citythird = Space;
        }
        System.out.println("The three cities in alphabetical order are " + cityfirst + " " + citysecond +" " + citythird);

    }
    
}
