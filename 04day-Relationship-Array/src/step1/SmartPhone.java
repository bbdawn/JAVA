package step1;

public class SmartPhone {
	private String model;
	private int price;
	
	//생성자 만들기 //alt+shift+s -> GCusingfields
	public SmartPhone(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	//alt+shift+s -> getterandsetter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
