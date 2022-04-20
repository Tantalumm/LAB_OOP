import java.util.Scanner;

public class LAB1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		int[] array = getArray();

		
		System.out.print("Enter the index of the array: ");
		try {
			
			System.out.println("The corresponding element value is " + array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
        input.close();
	}
    

	public static int[] getArray() {
		int[] array = new int[100];
		int random = (int)(Math.random()*101);
		for (int i = 0; i < array.length; i++) {
			array[i] = random ;
		}
		return array;
	}
}