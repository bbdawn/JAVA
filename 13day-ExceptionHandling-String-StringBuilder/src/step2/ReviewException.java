package step2;
//
public class ReviewException extends Exception {

	private static final long serialVersionUID = 797627083610926317L;
	public ReviewException(String message) {
		//�θ� Exception class�� �����ڸ� ȣ��, �� �� ���� �޼����� �Ҵ��ϰ� 
		//catch���������� Exception class�� getMessage()�� �̿��� ���� �޼����� ��ȯ���� �� �ִ�
		super(message);
		
	}
}
