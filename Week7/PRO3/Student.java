public class Student
		extends Person {
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	public Student(String Nname, String Naddress,String Nphone, String Nemail, int Nstatus) {
		super(Nname, Naddress, Nphone, Nemail);
		status = Nstatus;
	}

	
	public void setStatus(int Nstatus) {
		status = Nstatus; 
	}

	
	public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}

	
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}