package step5;
/*
 * Exception Handling : ���� �߻��� ��ó����� �����ϰ� ���α׷� ���� ����
 * try: ���� �߻� ���� ���� ��
 * catch : ����ó��, ����帧or��ó���
 * finally : �׻� ����(�������� �־ ����)
 * throws : ���� �߻� �� ȣ���� ������ �����Ѵ� (������_
 * 
 * throw: ���ܸ� ���Ƿ� �߻� 
 */

/* 
 * throw�� ���� ���� �߻��� �׽�Ʈ�ϱ� ���� ������ AgeException class�� �����Ѵ�
 * ���ο�ȭ���񽺿� ����� ���̰� 19�� �̸� �̼����� ��쿡 throw�� �̿���
 * AgeException�� �߻���Ű�� �޼��忡 throws�� ����� ȣ���� ������ �ش� ���ܸ� �����Ѵ�
 * 19�� �̻� ������ ��쿡�� ���������� ��ȭ ������ �ǵ��� �����Ѵ�. 
 */
public class TestThrow1 {
	public static void main(String[] args) {
		MovieService service=new MovieService();
		int age=11;
		//age=22;
		try {
			service.enter(age);
		} catch (AgeException e) {
			
			//e.printStackTrace();//���� �޼����� ��ü �߻� ��θ� ���
			System.out.println(e.getMessage());//���� �޼����� ��ȯ
			
		}
		System.out.println("���α׷� ���� ����");
	
	
	
	}
}
