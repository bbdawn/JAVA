package step5;

import java.io.Serializable;
// Person class를 이용해 객체를 생성한 후 
// 이 객체를 외부로 전송하기 위해서는 반드시 
// Serializable interface를 implements 해야 한다 
// 직렬화 되기 위해서는 Serializable 계층 구조의 하위에 존재해야 한다 
public class Person implements Serializable{
	/**
	 * 직렬화 버전의 고유값 ,
	 * 만약 직접 명시하지 않으면 자동 생성되는데 컴파일러에 따라 고유값이 다르게 
	 * 설정될 수 있기 때문에 직접 생성하는 것을 권장한다 
	 */
	private static final long serialVersionUID = -7137162190699209253L;
	private String name;
	private String address;
	private int money;
	public Person(String name, String address, int money) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
