package step9;

public class Account {
	private int balance;//instance variable int���� 0���� �ʱ�ȭ (����Ʈ �ʱ�ȭ)
	public int getBalance() {
		return balance;
	}
	
	//deposit �޼��带 ����, �Ű��������� money�� �Ѵ�.
	public void deposit(int money) {
		if(money>0) {
		balance+=money; //balance=balance+money;
		}else {
			System.out.println(money+"���� �߸��� �Աݾ��Դϴ�");
		}
	}
}
