package step7;

public class Product {
	private String name; //String->reference, name-> instance variable 
	private String maker; //reference
	private int price;  //int->primitive, price-> instance variable
	
	//생성자 constructor
	//생성자 명시하면 객체를 만드는 시점에 상품명, 제조사, 가격을 입력하지 않으면 객체를 못만들게 설정
	public Product(String name, String maker, int price) {
		this.name=name;
		this.maker=maker;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
