package step5;
/*
 * Exception class�� ����. java.lang.Exception�� ��ӹ޾Ƽ� ����� ��
 */
public class AgeException extends Exception{
	//java io ��ü ����ȭ���� ������ ����
	private static final long serialVersionUID = -4407398834061700388L;
	public AgeException(String message) {
		super(message); //�θ��� Exception class�� �����ڸ� ȣ���� ���ܸ޼����� �Ҵ�
	}
}
