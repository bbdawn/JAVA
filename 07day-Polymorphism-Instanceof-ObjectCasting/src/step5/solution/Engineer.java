package step5.solution;

public class Engineer extends Employee{
	private String skill;

	public Engineer(String empNo, String name, int salary, String skill) {
		super(empNo, name, salary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	//Employee 의 toString() 을 오버라이딩 
	public String toString() {
		return super.toString()+" skill:"+skill;
	}
}






