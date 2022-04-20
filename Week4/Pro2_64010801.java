import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Pro2_64010801 {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        Date Dateone = calendar.getTime();
        System.out.println(Dateone.getTime()); // find info for setting in calendar.setTimeInMillis(); 
        
        calendar.setTimeInMillis(1643695041912L); 

        //Show Year Month Date and Day_of_Week
        System.out.println("Year is  "+calendar.get(Calendar.YEAR));
        System.out.println("Month is "+calendar.get(Calendar.MONTH));
        System.out.println("Date is "+calendar.get(Calendar.DATE));
        System.out.println("Day of week is "+calendar.get(Calendar.DAY_OF_WEEK));
        
        System.out.println("---------------------------------------------------");
        
        System.out.println("After specified the elapsed time of one day after current day \n");
        System.out.println("Year is  "+calendar.get(Calendar.YEAR));
        System.out.printf("Month is  %d \n",calendar.get(Calendar.MONTH));
        System.out.printf("Date is  %d \n",calendar.get(Calendar.DATE) + 1);
        System.out.printf("Day of week is  %d \n",calendar.get(Calendar.DAY_OF_WEEK) + 1);
        

        //Show Time and Date
         System.out.println(new Date().toString());

    }
}
