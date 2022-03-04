package step9;

import java.io.Serializable;

public class Car implements Serializable{
	private static final long serialVersionUID = -3432733850603592450L;
	private String model;
	private int price;
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
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
