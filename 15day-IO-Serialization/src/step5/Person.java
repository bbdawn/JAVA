package step5;

import java.io.Serializable;
// Person class�� �̿��� ��ü�� ������ �� 
// �� ��ü�� �ܺη� �����ϱ� ���ؼ��� �ݵ�� 
// Serializable interface�� implements �ؾ� �Ѵ� 
// ����ȭ �Ǳ� ���ؼ��� Serializable ���� ������ ������ �����ؾ� �Ѵ� 
public class Person implements Serializable{
	/**
	 * ����ȭ ������ ������ ,
	 * ���� ���� ������� ������ �ڵ� �����Ǵµ� �����Ϸ��� ���� �������� �ٸ��� 
	 * ������ �� �ֱ� ������ ���� �����ϴ� ���� �����Ѵ� 
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
