package step6.test;

//import : ctrl+shift+o
import step6.access.Bank;

public class KostaBank extends Bank{
	public void accessTest() {
		
		publicTest();
		// ��ӹ޾����Ƿ� �θ��� �޼��� ��밡��
		
		protectedTest();
		//protected�� ���� ��Ű�������� ���� ����������
		//��ӹ޾����Ƿ� �ٸ� ��Ű�������� ���� ����
		
		//defaultTest(); //default�� �ٸ� ��Ű������ ���� �Ұ�
		//privateTest(); //private�� �ڽ��� Ŭ���� ������ ��� ����
	}
}

