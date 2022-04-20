public class Faculty 
		extends Employee {
	
	private String officeHours;
	private String rank;


	public Faculty(String Nname, String Naddress, String Nphone, String Nemail, String Noffice, double Nsalary, String NofficeHours, String Nrank) {
		super(Nname, Naddress, Nphone, Nemail, Noffice, Nsalary);
		officeHours = NofficeHours;
		rank = Nrank;
	}

	
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String NofficeHours) {
		officeHours = NofficeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String Nrank) {
		rank = Nrank;
	}


	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +"\nRank: " + rank;
	}
}
