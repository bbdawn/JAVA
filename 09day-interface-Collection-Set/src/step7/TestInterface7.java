package step7;
//jdk1.8�̻󿡼� �����ϴ� interface�� default method�� static method test

interface OpenSourceInterface{//interface�� ������ �޼��带 ������ �� ������ ���������� �������� default method�� ���
	public void a();
	public default void b() {
		System.out.println("default method");
	}
	public static void c() {//interface�� Object member�� ������ �޼���� ������ �� ������ static method�� ���
		System.out.println("interface static method");
	}
	
}

class KbBank implements OpenSourceInterface{
	public void a() {}
}

class KaKaoBank implements OpenSourceInterface{
	public void a() {}
	//�ʿ�� �ڽſ� �°� default method�� �������̵� �� �� �ִ�
	public void b() {
		System.out.println("default method online only");
	}
}


public class TestInterface7 {
	public static void main(String[] args) {
		OpenSourceInterface os=new KbBank();
		os.b();
		
		//static method�� Interface��.static method�� ���� -> ��ü ������ ����� �ƴϴ�
		OpenSourceInterface.c();
		OpenSourceInterface os2=new KaKaoBank();
		os2.b();
	}
	

}
