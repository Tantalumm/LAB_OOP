package Week3;

public class Pro1_64010801 {
    public static void main(String[] args) 
    {
        int countnumber = 0;
        for(int i = 2; countnumber != 100; i++)
         {
            if (isPalindrome(i)==true && isPrime(i)==true)
            {
                System.out.print(i+" ");
                countnumber++;
                //new line
                if(countnumber % 10 == 0)
                {
                    System.out.println();
                }
            }
        }
    }
    public static int reverse(int n) 
    {
        int reverseNum = 0;
        int num;
        while(n > 0)
        {
            num = n % 10;
            reverseNum *= 10;
            reverseNum += num;
            n /= 10;
        }     
        return reverseNum;
    }
    
    public static boolean isPalindrome(int n) 
    {
        return reverse(n) == n;
    }

    
    public static boolean isPrime(int n) 
    {
        for(int i = 2; i <= n/2 ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
            return true;    
    }
}
