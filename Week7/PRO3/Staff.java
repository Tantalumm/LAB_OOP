public class Staff
		extends Employee {
	
	private String title;


	public Staff(String name, String Naddress, String Nphone,  String Nemail, String Noffice, double Nsalary, String Ntitle)
	{
		super(name, Naddress, Nphone, Nemail, Noffice, Nsalary);
		title = Ntitle;
	}

	
	public String getTitle() {
		return title;
	}

	
	public void setTitle(String Ntitle) {
		title = Ntitle;
	}

	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}