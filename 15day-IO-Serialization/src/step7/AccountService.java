package step7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import common.Path;

public class AccountService {
	private String path = Path.TEST_PATH + "account.obj";

	// path�� �ش��ϴ� ���Ͽ� Account ��ü�� �޸𸮸� ����ȭ�Ͽ� ����
	public void saveObject(Account account) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=null;//���������� ����� ���� �������� ��밡���ϹǷ� finally���� close �ϱ� ���� ���⼭ ���� 	
		try {
			oos=new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(account);
		} finally {
			if(oos!=null)
				oos.close();//ProcessingStream �� close �ϸ� �ȴ� 
		}
	}// method
	// path�� �ش��ϴ� ���Ͽ��� ������ȭ�ؼ� Account ��ü�� ��ȯ�޾� ���� 
	public Account loadObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		Account account=null;
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream(path));
			account=(Account) ois.readObject();
		}finally {
			if(ois!=null)
				ois.close();
		}
		return account;
	}
}




















