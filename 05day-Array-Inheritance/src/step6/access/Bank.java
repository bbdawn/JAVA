package step6.access;

public class Bank {
	public void publicTest() {
		System.out.println("public method");
	}
	
	protected void protectedTest() {
		System.out.println("protected method");
	} //�ٸ� ��Ű������ ������ ���� �� Ŭ����Bank�� ��ӹ޾��� ���� ��� ����
	
	void defaultTest() {
		System.out.println("default method");
	}
	
	/*����� warning �޼��� ������ �ּ�ó��
	private void privateTest() {
		System.out.println("private method");
	}
	*/

}
