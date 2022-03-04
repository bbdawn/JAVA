package step3;

public class Friend {
	private String name;
	private int money;
	
	//construct
	public Friend(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	//gettersetter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//toString()
	@Override
	public String toString() {
		return "Friend [name=" + name + ", money=" + money + "]";
	}
	
	
	
	
}
