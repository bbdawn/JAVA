package step3;

public class Employee {//별도의 상속관계가 없으면 extends Object 처리 
	private String empNo;
	private String name;
	private int salary;
	public Employee(String empNo, String name, int salary) {
		super();// java.lang.Object 의 생성자 호출해서 Object 객체 생성
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
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
