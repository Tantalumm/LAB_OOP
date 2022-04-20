package Week2;

import java.util.Scanner;
public class Pro5_64010801 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int num = input.nextInt();
        input.close();
        if(num > 15 || num < 0)
        {
            System.out.print("ERROR");
        }
        else
        {
            for(int rows = 1; rows <= num; rows++)
            {
                for (int space = num - rows; space >= 1; space--)
                {
                    System.out.print("  ");
                }
                for(int i = rows; i >= 2; i--)
                {
                    System.out.print(i + " ");
                }
                for(int j = 1; j <= rows; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
    
}
