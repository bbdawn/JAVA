package step9;

public class Person {
	private String name;

	
	//generate field
	public Person(String name) {
		this.name = name;
	}
	/*
	 * Person use a RentCar �� association ����
	 * tour �޼��� ���� ���ȿ��� RentCar�� �����Ǹ� �Ǵ� �����̹Ƿ�
	 * Local Variable�� ó���Ѵ� -> �� �޼��尡 ����Ǹ�(����� ������ ��ġ��) RentCar ��ü�� �޸𸮿��� ����. GC(�������÷���)�� ���Ե�. 
	 */

	public void tour() { //���� ��ġ�� �����°�
		RentCar car=new RentCar("�׽���", "����");
		System.out.println(name+" "+car.getColor()+" "+car.getModel()+ "Ÿ�� �����ϴ�");
	}
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
