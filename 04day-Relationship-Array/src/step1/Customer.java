package step1;

public class Customer {
	private String name;
	//aggregation(has a)
		/*
		 * 
		 * smartPhone : reference variable�̰� instance variable(local variable �ƴ�)
		 */
	private SmartPhone smartPhone;
	
	public Customer(String name, SmartPhone smartPhone) {
		super();
		this.name = name;
		this.smartPhone = smartPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SmartPhone getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	
}


	