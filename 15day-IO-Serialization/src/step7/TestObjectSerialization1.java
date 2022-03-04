package step7;

import java.io.IOException;

public class TestObjectSerialization1 {
	public static void main(String[] args) {
		AccountService service=new AccountService();
		Account account=new Account("아이유","spring",100);
		//try
		try {
			service.saveObject(account);
			System.out.println("계좌객체를 직렬화하여 파일에 저장");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
