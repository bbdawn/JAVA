package step3;

/*
 * case2
 * TestException1������ Exception�߻��ϰ� ��� ����Ǿ��µ�
 * TestException2������ ExceptionHandling(����ó��)�ؼ� Exception�߻��� Exception�� ���� 
 * ����帧or��ó���oró���� ���� ����帧�� ������ �� ���α׷��� ���������Ѻ���
 * 
 * try{
 * 	���� �߻� ���� ���� 
 * }catch(Exception e}{
 * 	���� �߻��� ������ ��� �ڵ� ����
 * }
 */

public class TestException2 {
	public static void main(String[] args) {
		
		String name="������";
		//���ڿ� ���� ���ϴ� �޼��� length();
		//test�� ���� name�� null�� �Ҵ��غ���
		name=null;
		try {
		System.out.println(name.length()); //NullPointException�߻��ǰ� �޼��� ��� �� ��� �����. 
		}catch(NullPointerException e) {
			System.out.println("name�� null�̹Ƿ� ���̸� ���� �� �����ϴ� -> ��� ����");
		}	
		System.out.println("���α׷� ���� ����");
	}
}
