package step5;

public class Employee {
	private String empNo;
	private String name; //이름
	private int salary; //월급
	//constructor, setter, getter
	
	public Employee(String empNo, String name, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	
	
	//getDetails()메서드를 정의해서 전체 속성 정보를 반환하는 기능 명시
	public String getDetails() {
		return "empNo:"+empNo+" name:"+name+" salary:"+salary;
	}
	
	
	
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
