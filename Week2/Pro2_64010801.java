package Week2;

import java.util.Scanner;
public class Pro2_64010801 {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper(2) : ");
        int user = input.nextInt();

        System.out.print("The computer is ");

        input.close();
        
        int computer = (int)(Math.random() *3);
        switch(computer)
        {
            case 0: System.out.print("scissor.");
            break;
            case 1: System.out.print("rock.");
            break;
            case 2: System.out.print("paper.");
            break;
        }
        System.out.print(" You are ");
        switch(user)
        {
            case 0: System.out.print("scissor.");
            break;
            case 1: System.out.print("rock.");
            break;
            case 2: System.out.print("paper.");
            break;
        }
        if(computer == user)
        {System.out.println(" too. It is a draw");}
        else
        {
            boolean win = (user == 0 && computer == 2)||(user == 1 && computer ==0)||(user == 2 && computer ==1);
            if(win)
            {
                System.out.println(" You won");
            }
            else
            {
                System.out.println(" You lose");
            }
        }



    }
    
}
