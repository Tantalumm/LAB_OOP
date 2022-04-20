public class Pro3_64010801 {
    public static void main(String[] args) {
        double[] randomArray = new double[1000];
        System.out.println("Creating a list containing 1,000 elements");
        for (int i = 0; i < randomArray.length; i++)
        {
            randomArray[i] = (double) (Math.random() * 100);
            System.out.printf("%10.2f",randomArray[i]);
            if((i+1)%10 == 0)  
            {
                System.out.println();
            }
        }
        System.out.println("List created.");
        System.out.println("Sorting stopwatch start...");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(randomArray);
        for(int i = 0; i < randomArray.length; i++)
        {
            System.out.printf("%10.2f",randomArray[i]);
            if((i+1)%10 == 0)  
            {
                System.out.println();
            }
        }
        stopWatch.stop();
        System.out.println("Sorting stopwatch start...");
        System.out.println("Time elapsed: "+stopWatch.getElapsedTime()+"milliseconds.");

        stopWatch.start();
        int countnumber = 0;
        for(int i = 2; countnumber != 1000; i++)
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
        stopWatch.stop();
        System.out.println("Palindrome");
        System.out.println("Sorting stopwatch start...");
        System.out.println("Time elapsed: "+stopWatch.getElapsedTime()+"milliseconds.");


    } 
    
    public static void selectionSort(double[] m)
    {
        for(int i = 0; i < m.length - 1; i++)
        {
            int index = i;
            for(int j = i+1; j<m.length; j++)
            {
                if(m[j] < m[index]){
                    index = j;
                }
            }
            double minnum = m[index];
            m[index] = m[i];
            m[i] = minnum;
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
