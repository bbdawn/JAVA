package step3;

public class Person {
	public void eat() {
		System.out.println("�Դ�");
	}
	
	public void eat(String menu) {//Overloading
		System.out.println(menu+"�Դ�");
	}
	
	public void eat(int count) {//Overloading
		System.out.println(count+"�κ�");
	}
	
	public void eat(String menu,int count) {//Overloading
		System.out.println(menu+" "+count+"�κ� �Դ�");
	}
	
	public void eat(int count, String menu) {//Overloading �Ű����� ���� �� Ÿ���� �ٸ��Ƿ� ok
		System.out.println(menu+" "+count+"�κ� �Դ�");
	}
	
	
	//ctrl+shift+/ ���� �ּ� ó��, ctrl+shift+\ �����ּ�����
	//ctrl+shift+f : �ڵ� ����
	//ctrl+shift+o : import
	
	//�Ʒ� compile error : ������ �ٸ� �� �Ű������� Ÿ��, ����, ������ ��ġ�Ͽ�
	//������ �޼���� �νĵǾ� �����ε� �ȵ�. 
	/*
	 * public void eat(int c, String m) {//Overloading
	 * System.out.println(menu+" "+count+"�κ� �Դ�"); }
	 */
	
	
	
}
