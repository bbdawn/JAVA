package step5;

public class Manager extends Employee{
	private String department;
	//constructor, getter, setter
	//getDetails() -> overriding

	
	//constructor
	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department = department;
	}

	//메서드 오버라이딩
	public String getDetails(){
		//return "empNo:"+super.getEmpNo()+" name:"+super.getName()+" salary:"+super.getSalary()+" department: "+department;
		return super.getDetails()+" department:"+department;
		//super를 이용해 부모메서드를 재사용하고
		//추가적으로 필요한 부분을 명시!!
	}
	
	//getter setter
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
