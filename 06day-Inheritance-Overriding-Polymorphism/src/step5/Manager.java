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

	//�޼��� �������̵�
	public String getDetails(){
		//return "empNo:"+super.getEmpNo()+" name:"+super.getName()+" salary:"+super.getSalary()+" department: "+department;
		return super.getDetails()+" department:"+department;
		//super�� �̿��� �θ�޼��带 �����ϰ�
		//�߰������� �ʿ��� �κ��� ���!!
	}
	
	//getter setter
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
