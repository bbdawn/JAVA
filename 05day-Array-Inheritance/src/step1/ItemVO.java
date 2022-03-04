//VO : ValueObject 값을 저장하는 객체
//Service : 일을 하는 객체. 비즈니스 로직(업무. 이 시스템에서 하는 일들)를 정의하는 클래스
package step1;

public class ItemVO {
	private String name;
	private String maker;
	private int price;
	
	//생성자 만들기 //fields
	public ItemVO(String name, String maker, int price) {
		super();
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	
	//gettersetter
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
