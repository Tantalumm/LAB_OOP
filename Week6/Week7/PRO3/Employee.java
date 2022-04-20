public class Employee
		extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;


	public Employee(String Nname, String Naddress, String Nphone,String Nemail, String Noffice, double Nsalary) {
		super(Nname, Naddress, Nphone, Nemail);
		office = Noffice;
		salary = Nsalary;
		dateHired = new MyDate();
	}


	public String getOffice() {
		return office;
	}


	public String getSalary() {
		return String.format("%.2f", salary);
	}


	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() 
				 + "/" + dateHired.getYear();
	}


	public void setOffice(String Noffice) {
		office = Noffice;
	}

	public void setSalary(double Nsalary) {
		salary = Nsalary;
	}


	public void setDateHired() {
		dateHired = new MyDate();
	}

	public String toString() {
		return super.toString() + "\nOffice: " + office +  "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}