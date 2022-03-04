package model;

public class Employee extends Member {
	private String department;

	//construct
	public Employee(String tel, String name, String address, String department) {
		super(tel, name, address);
		this.department = department;
	}

	
	//gettersetter
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	//toString()
	@Override
	public String toString() {
		return "Employee ["+super.toString()+" department:" + department + "]";
	}
	
	
}
