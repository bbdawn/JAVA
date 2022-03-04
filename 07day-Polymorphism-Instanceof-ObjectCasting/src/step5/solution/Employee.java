package step5.solution;

public class Employee {//extends Object
	private String empNo;
	private String name;
	private int salary;
	public Employee(String empNo, String name, int salary) {
		super();
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
	//java.lang.Object class의 toString() 메서드를 오버라이딩해서 객체의 주소값 대신 실제 속성정보값을 리턴
	public String toString() {
		return "empNo:"+empNo+" name:"+name+" salary:"+salary;
	}
}







