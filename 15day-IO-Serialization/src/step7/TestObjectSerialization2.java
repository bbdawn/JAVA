package step7;

import java.io.IOException;

public class TestObjectSerialization2 {
	public static void main(String[] args) {
		// account.obj �� ����ȭ�Ǿ� ����� ������ ������ȭ�Ͽ�
		//Account ��ü�� �޸𸮷� �����ϴ� ���� 
		AccountService service=new AccountService();			
		try {
			Account account= service.loadObject();
			System.out.println("�����ָ�:"+account.getName());//������
			System.out.println("�ܾ�:"+account.getBalance());//100
			//password�� transient ����Ǿ� ����ȭ ��󿡼� ���ܵǾ����Ƿ�
			//null �� ���´� 
			System.out.println("��й�ȣ:"+account.getPassword());//null			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
