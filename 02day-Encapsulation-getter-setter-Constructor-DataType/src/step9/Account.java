package step9;

public class Account {
	private int balance;//instance variable int형은 0으로 초기화 (디폴트 초기화)
	public int getBalance() {
		return balance;
	}
	
	//deposit 메서드를 정의, 매개변수명은 money로 한다.
	public void deposit(int money) {
		if(money>0) {
		balance+=money; //balance=balance+money;
		}else {
			System.out.println(money+"원은 잘못된 입금액입니다");
		}
	}
}
