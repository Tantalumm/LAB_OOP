public class PRO3 {
	// Main method
	public static void main(String[] args) {
		
	
		Person person = new Person("TAN", "CHIANGMAI", "012-345-6789", "TannySoCute@gmail.com");

		Student student = new Student("TLE", "RAYONG", "987-654-3210", "TleDekNgo@gmail.com", Student.FRESHMAN);	//(1freshman, 2sophomore, 3junior,4senior)

		Employee employee = new Employee("TOBBY", "BANGKOK", "000-111-2223","TobbyKodCool@gmail.com", "KodCool", 60000);

		Faculty faculty = new Faculty("TON", "CHONBURI", "088-777-999","ProfessorTon@gmail.com", "Chonburi University", 50000, "4pm to 6pm", "Professor");

		Staff staff = new Staff("TOM", "BANGKOK", "999-999-9999","TommyHaveMoney@gmail.com", "HONEY COMPANY", 100000, "Executive Assistant");


		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		
	}
}