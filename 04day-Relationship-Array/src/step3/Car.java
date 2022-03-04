package step3;

public class Car {
	private String model;
	private Engine engine;
	public Car(String model) { //생성자 만듦
		this.model=model;
		//composition 관계이므로 Car 객체 생성되던중에 Engine 객체를 생성해서 할당한다
		//그래서 Heap에 Engine 객체 먼저 만들어지고 Car 객체 만들어짐
		this.engine=new Engine("터보",2000);
	}
	//getter-setter
	public Engine getEngine() {
		return engine; //engine 객체의 주소값을 반환하게됨
	}
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
