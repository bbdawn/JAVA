package step7;

public class TestVariableScope {
	public static void main(String[] args) {
		Person p=new Person(); 
		//p�� local variable. �޼��� ������ ���������ϱ�. 
		//p�� stack�� �����
		p.test1();
		p.test2(2);
	}
}
