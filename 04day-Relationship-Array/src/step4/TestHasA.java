package step4;

public class TestHasA {
	public static void main(String[] args) {
		//���� �޼����� �ڵ尡 ����ǵ��� Ŭ������ �����غ��� ����
		School school=new School("�ڽ�Ÿ�ʵ��б�");
		//result: �ڽ�Ÿ�ʵ��б�
		System.out.println(school.getName()); 
		school.setBus(new Bus("����",30));
		
		//result: ����
		System.out.println(school.getBus().getMaker());
		//result: 30
		System.out.println(school.getBus().getCount());
		
	}
	
	
	
	
	
}
