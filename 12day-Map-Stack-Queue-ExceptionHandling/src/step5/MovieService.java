package step5;

public class MovieService {
	public void enter(int age) throws AgeException {
		if(age<19) {//����Ұ�. 19�� �̸��̸� AgeException�� �߻��ñ��
		throw new AgeException(age+"�� �̼����̹Ƿ� ��ȭ�����Ұ��մϴ�");	
		}
		System.out.println("��ſ� ���ο�ȭ �����Ǽ���");
		
	}//method
}//class
