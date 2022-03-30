package step1;

public class Customer {
	private String name;
	// aggregation ,  has a 
	/*
		smartPhone : reference variable 이고 instance variable 임 
	 */
	private SmartPhone smartPhone;
	// smartPhone 객체의 주소값을 리턴하므로 리턴타입은 클래스명인 SmartPhone이 된다 
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	//매개변수이자 지역변수인 smartPhone 의 타입은 SmartPhone 이 된다 
	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}








