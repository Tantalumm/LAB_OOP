import java.io.*;


public class LAB3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//create
		File file = new File("Salary.txt");
		//check
		if (file.exists()) {
			System.out.println("File " + file.getName() + " already exists");
			System.exit(0);
		}

		String rank = "";
		double salary;
		try (
			PrintWriter output = new PrintWriter(file);
		) {
			
			for (int i = 1; i <= 1000; i++) {
				//name
				output.print("FirstName" + i + " LastName" + i);
				//rank + salary
				rank = getRank();
				salary = getSalary(rank);		
				output.printf(" " + rank + " %.2f\n", salary);
			}
		}
	}

	public static String getRank() {
		String[] ranks = {"assistant", "associate", "full"};
		int Rrank = (int)(Math.random() * ranks.length);
		return ranks[Rrank];
	}

	//random salary
	public static double getSalary(String rank) {
		double RSalary1 = 50000 + (double)(Math.random() * 30001);
		double RSalary2 = 60000 + (double)(Math.random() * 50001);
		double RSalary3 = 75000 + (double)(Math.random() * 55001);
		if (rank.equals("assistant"))
			return  RSalary1;
		else if (rank.equals("associate"))
			return RSalary2;
		else
			return  RSalary3;
	}
}
