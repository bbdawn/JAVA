package step1;

/*
 * String : �Һ�, ������ ���ڿ��� ���������� ����� �� ����
 * StringBuilder(StringBuffer) : ����, �ϳ��� ���ڿ��� ���� ����� �� ����
 */



public class TestReviewStringAndStringBuilder {
	public static void main(String[] args) {
		String s1="�����"; //heap ���� String Constant Pool�� ����
		String s2="�����"; //s1�� ������ ���ڿ��� �����ؼ� ��� (��, ������� �����ϴ� ��)

		System.out.println(s1.concat("����")); //String Constant Pool�� "����μ���"��� ���ڿ��� ���� ������
		System.out.println(s1);//����� //������ �����! ������ �ʾ��� (�Һ�)
		System.out.println(s2);//����� //������ �����! ������ �ʾ��� (�Һ�)
		
		System.out.println("*********************");
		
		StringBuilder sb=new StringBuilder("�̽¿�");
		System.out.println(sb);//�̽¿�
		System.out.println(sb.append("����")); //�̽¿켱�� //�̶��� ��ü�� �����
		System.out.println(sb);//�̽¿켱�� //��ü�� ����Ǿ����. (����)
		
		System.out.println("*********************");
		
		String name1="Ȳ����";
		String name3="Ȳ����";
		System.out.println(name1==name3);//��� ����. ������ �̷����ϸ� �ȵ�
										 //String Constant Pool�� ������ ���ڿ��� �����ϹǷ� �� ����������
										 //�پ��� ������� ���ڿ��� ������ �� �����Ƿ�
										 //==�����ڷ� ���ؼ��� �ȵȴ�!
		
		StringBuilder name2=new StringBuilder("Ȳ����");
		
		System.out.println(name1+" "+name2); //System.out.println(name1==name2); //error: Ÿ���� �ٸ��Ƿ� compile error
		
		//StringBuilder�� toString()�� �̿��ؼ� ��
		System.out.println(name1==name2.toString());//false --> ==���ڿ��񱳿� �������� �ʴ� 
		
		System.out.println(name1.equals(name2.toString()));//equals�� �̿��ؾ���
		
		System.out.println(name1.contentEquals(name2));//contentEquals�� �̿��ϸ� toString()���� �ٷ� �� ����
	
	}
}


















