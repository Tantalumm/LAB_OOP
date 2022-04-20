package Week3;
import java.util.Arrays;
import java.util.Scanner;
public class Pro2_64010801 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
		System.out.print("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		System.out.print("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		int[] list3 = merge(list1,list2);
	
        System.out.print("The merged list is ");
        for (int i = 0; i < list3.length; i++) {
         System.out.print(list3[i]+ " ");
        }
	}
		public static int[] merge(int[] list1, int[] list2)  {
		int[] list3 = new int[list1.length + list2.length];
		
		System.arraycopy(list1,0,list3,0,list1.length);
		System.arraycopy(list2,0,list3,0,list2.length);

		Arrays.sort(list3);
		return list3;
	}  
}
