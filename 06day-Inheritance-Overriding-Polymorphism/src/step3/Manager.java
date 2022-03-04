package step3;

public class Manager extends Employee{
	private String department;
	/*
	 * Manager class에서 생성자를 직접 명시하지 않는다면 아래와 같이 삽입된다
	 * public Manager(){super();} --> 이 때 super()는 부모 Employee class의 매개변수가 없는 기본 생성자를 호출하려하고
	 * 부모 Employee에는 기본생성자가 존재하지 않으므로 compile error가 난다.
	 * 그러므로 아래와 같이 생성자를 명시하고 첫 라인에 직접 부모 생성자의 매개변수에 알맞는 인자를 전달하는 
	 * super(empNo, name, salary)를 명시하면 된다.
	 * 
	 */
	public Manager(String empNo,String name,int salary,String department) {
		super(empNo,name,salary);//부모 생성자 매개변수에 맞는 인자를 전달하여 생성자 호출
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
