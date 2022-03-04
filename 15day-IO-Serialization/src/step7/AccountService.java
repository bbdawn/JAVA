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

	// path에 해당하는 파일에 Account 객체의 메모리를 직렬화하여 저장
	public void saveObject(Account account) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=null;//지역변수는 선언된 영역 내에서만 사용가능하므로 finally에서 close 하기 위해 여기서 선언 	
		try {
			oos=new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(account);
		} finally {
			if(oos!=null)
				oos.close();//ProcessingStream 만 close 하면 된다 
		}
	}// method
	// path에 해당하는 파일에서 역직렬화해서 Account 객체로 반환받아 리턴 
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




















