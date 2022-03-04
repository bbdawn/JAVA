package step9;

public class RentCar {
	private String model;
	private String color;
	
	
	//generate field
	public RentCar(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	
	//getter setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
