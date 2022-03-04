package step3;

public class Manager extends Employee{
	private String department;
	/*
	 * Manager class���� �����ڸ� ���� ������� �ʴ´ٸ� �Ʒ��� ���� ���Եȴ�
	 * public Manager(){super();} --> �� �� super()�� �θ� Employee class�� �Ű������� ���� �⺻ �����ڸ� ȣ���Ϸ��ϰ�
	 * �θ� Employee���� �⺻�����ڰ� �������� �����Ƿ� compile error�� ����.
	 * �׷��Ƿ� �Ʒ��� ���� �����ڸ� ����ϰ� ù ���ο� ���� �θ� �������� �Ű������� �˸´� ���ڸ� �����ϴ� 
	 * super(empNo, name, salary)�� ����ϸ� �ȴ�.
	 * 
	 */
	public Manager(String empNo,String name,int salary,String department) {
		super(empNo,name,salary);//�θ� ������ �Ű������� �´� ���ڸ� �����Ͽ� ������ ȣ��
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
