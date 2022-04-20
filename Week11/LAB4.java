import java.util.*;
import java.io.*;

public class LAB4 {
	public static void main(String[] args) {
		// Create three ArrayLists
		ArrayList<Double> assistant = new ArrayList<>();
		ArrayList<Double> associate = new ArrayList<>();
		ArrayList<Double> full = new ArrayList<>();

		// Read data from url
		try {
			File file = new File("Salary.txt");
			Scanner readfile = new Scanner(file);

			while(readfile.hasNext()){
				String[] line = (readfile.nextLine().split(" "));
				processData(assistant ,associate ,full ,line[2] ,Double.parseDouble(line[3]));
			}
			readfile.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("Eror not found");
			System.exit(0);
		}

		double totalAssistant = getTotal(assistant);
		double totalAssociate = getTotal(associate);
		double totalFull = getTotal(full);
		double totalFaculty = (totalAssistant + totalAssociate + totalFull);

		// Display results
		System.out.printf("Total salary for assistant professors is %.2f\n", totalAssistant);
		System.out.printf("Total salary for associate professors is %.2f\n", totalAssociate);
		System.out.printf("Total salary for full professors is %.2f\n", totalFull);
		System.out.printf("Total salary for all professors is %.2f\n", totalFaculty);

		System.out.printf("Average salary for assistant professors is %.2f\n", (totalAssistant / assistant.size()));
		System.out.printf("Average salary for associate professors is %.2f\n", (totalAssociate / associate.size()));
		System.out.printf("Average salary full professors is %.2f\n", (totalFull / full.size()));
		System.out.printf("Average salary all professors is %.2f\n", (totalFaculty / (assistant.size() + associate.size() + full.size())));
	}

	
	public static double getTotal(ArrayList<Double> list) {
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		return total;
	}

	public static void processData(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c, String rank, double salary) {
		if (rank.equals("assistant")){
			a.add(salary); 
		}
		else if (rank.equals("associate"))
			b.add(salary);
		else if (rank.equals("full"))
			c.add(salary);
	}
}
