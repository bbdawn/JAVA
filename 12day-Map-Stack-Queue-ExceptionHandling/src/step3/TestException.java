package step3;

/*
 * case1
 * ���α׷� ����� Exception��Ȳ�� �߻��Ǹ� 
 * JVM�� Exception �߻���Ű�� ���α׷��� ��� ����Ǵ� ���� Ȯ���ϴ� ����
 */

public class TestException {
	public static void main(String[] args) {
		
		String name="������";
		//���ڿ� ���� ���ϴ� �޼��� length();
		//test�� ���� name�� null�� �Ҵ��غ���
		name=null;
		System.out.println(name.length()); //NullPointException�߻��ǰ� �޼��� ��� �� ��� �����. 
		System.out.println("���α׷� ���� ����");
	}
}
