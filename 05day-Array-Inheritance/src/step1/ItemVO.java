//VO : ValueObject ���� �����ϴ� ��ü
//Service : ���� �ϴ� ��ü. ����Ͻ� ����(����. �� �ý��ۿ��� �ϴ� �ϵ�)�� �����ϴ� Ŭ����
package step1;

public class ItemVO {
	private String name;
	private String maker;
	private int price;
	
	//������ ����� //fields
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
