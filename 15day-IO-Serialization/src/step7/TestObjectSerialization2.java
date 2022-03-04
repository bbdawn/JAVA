package step7;

import java.io.IOException;

public class TestObjectSerialization2 {
	public static void main(String[] args) {
		// account.obj 에 직렬화되어 저장된 정보를 역직렬화하여
		//Account 객체의 메모리로 복원하는 예제 
		AccountService service=new AccountService();			
		try {
			Account account= service.loadObject();
			System.out.println("계좌주명:"+account.getName());//아이유
			System.out.println("잔액:"+account.getBalance());//100
			//password는 transient 적용되어 직렬화 대상에서 제외되었으므로
			//null 이 나온다 
			System.out.println("비밀번호:"+account.getPassword());//null			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
