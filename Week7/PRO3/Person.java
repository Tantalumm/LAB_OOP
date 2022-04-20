public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;

	
	public Person() {
		this("Unknown","Unknown","Unknown","Unknown");
	}

	
	public Person(String Nname, String Naddress, String Nphone, String Nemail) {
		name = Nname;
		address = Naddress;
		phone = Nphone;
		email = Nemail;
	} 

	
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}

	
	public String getPhone() {
		return phone;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setName(String Nname) {
		name = Nname;
	}

	
	public void setAddress(String Naddress) {
		address = Naddress;
	}

	
	public void setPhone(String Nphone) {
		phone = Nphone;
	}

	
	public void setEmail(String Nemail) {
		email = Nemail;
	}

	
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email ;
	}
}