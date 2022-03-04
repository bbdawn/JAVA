package step5.solution;

public class Manager extends Employee{
	private String department;

	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	// Employee 의 toString() 을 오버라이딩 
	public String toString() {
		return super.toString()+" department:"+department;
	}
}







