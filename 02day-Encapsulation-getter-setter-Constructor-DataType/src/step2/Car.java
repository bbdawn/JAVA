package step2;

public class Car {
	private String model;
	private int price;
	public void setModel(String model){//setter(할당받는용도) 만들기
		this.model=model; //this!!!
	}
	public String getModel() {
		return model;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	
}
