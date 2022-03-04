package step9;

public class TestIf3 {
	public static void main(String[] args) {
		Account a=new Account();
		a.deposit(100);//100원을 입금
		a.deposit(200);//200원을 입금
		a.deposit(0);//0원은 잘못된 입금액입니다 출력
		System.out.println("계좌 잔액:"+a.getBalance());
		
	}
}
