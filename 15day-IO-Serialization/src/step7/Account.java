package step7;

import java.io.Serializable;

// ��ü ����ȭ �Ǳ� ���ؼ��� Serializable interface�� implements �ؾ� �Ѵ� 
public class Account implements Serializable{
	/**
	 * ����ȭ �������� ���� �����ϴ� ���� ���� 
	 */
	private static final long serialVersionUID = 6901109142302297248L;
	private String name;
	private transient String password; // transient modifier : ����ȭ ��󿡼� ���� ( ���� ��󿡼� ���� ) 
	private int balance;
	public Account(String name, String password, int balance) {
		super();
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
