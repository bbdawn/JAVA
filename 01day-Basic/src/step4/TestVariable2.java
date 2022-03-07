package step4;

public class TestVariable2 {
	public static void main(String[] args) {
		//객체 생성 
		Car c=new Car();
		//객체의 모델명을 할당 
		c.model="K5";
		//객체의 가격을 할당 
		c.price=2000;
		System.out.println(c.model);
		System.out.println(c.price);
	}
}
