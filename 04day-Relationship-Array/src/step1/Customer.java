package step1;

public class Customer {
	private String name;
	// aggregation ,  has a 
	/*
		smartPhone : reference variable �̰� instance variable �� 
	 */
	private SmartPhone smartPhone;
	// smartPhone ��ü�� �ּҰ��� �����ϹǷ� ����Ÿ���� Ŭ�������� SmartPhone�� �ȴ� 
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	//�Ű��������� ���������� smartPhone �� Ÿ���� SmartPhone �� �ȴ� 
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








