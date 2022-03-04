package step7;

import java.io.Serializable;

// 객체 직렬화 되기 위해서는 Serializable interface를 implements 해야 한다 
public class Account implements Serializable{
	/**
	 * 직렬화 고유값은 직접 생성하는 것을 권장 
	 */
	private static final long serialVersionUID = 6901109142302297248L;
	private String name;
	private transient String password; // transient modifier : 직렬화 대상에서 제외 ( 전송 대상에서 제외 ) 
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
