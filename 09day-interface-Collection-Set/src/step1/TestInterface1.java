package step1;

public class TestInterface1 {
	public static void main(String[] args) {
		System.out.println(Flyer.ID);
		//Flyer.ID="spring"; //error: ����̹Ƿ� ���Ҵ� �ȵ�
		 //���� �������̽� Ÿ������ ���� ��ü�� ����
		Flyer f1=new Bird();
		f1.fly();
		Flyer f2=new Airplane();
		f2.fly();
		
		
	}

}
