package step9;

public class Person {
	private String name;

	
	//generate field
	public Person(String name) {
		this.name = name;
	}
	/*
	 * Person use a RentCar 측 association 관계
	 * tour 메서드 실행 동안에만 RentCar가 유지되면 되는 관계이므로
	 * Local Variable로 처리한다 -> 이 메서드가 종료되면(사람이 여행을 마치면) RentCar 객체를 메모리에서 해제. GC(가비지컬렉션)로 남게됨. 
	 */

	public void tour() { //여행 마치면 끝나는거
		RentCar car=new RentCar("테슬라", "검정");
		System.out.println(name+" "+car.getColor()+" "+car.getModel()+ "타고 여행하다");
	}
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
