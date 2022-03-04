package step9;
// 다형성 적용시 장점을 확인하는 예제 
class Product{}
class Food extends Product{}
class Computer extends Product{}
class Phone extends Product{}
class KostaMarketService{ 
	// Product 계열의 자식 객체가 아주 다양하게 존재한다면 아래와 같은 방식은 비효율적이다 
	// 결합도(coupling) 가 높은 구조, 즉 상품 종류가 증가되면 메서드가 추가되어야 하는 구조 -> 유지보수성이 낮다  
	/*
	public void buy(Food f) {} 
	public void buy(Computer c) {} 
	public void buy(Phone p) {} 
	*/
	// 아래와 같이 다형성이 적용되는 부모 타입으로 매개변수를 선언하면 하나의 메서드로 다양한 객체를 처리할 수 있다 
	// 이 것이 다형성의 장점이다 
	// 다형성이란 하나의 인터페이스(소통부:buy메서드)로 다양한 객체들(Food,Computer,Phone...)이 
	// 각자의 방식으로 동작하게 하는 성질이다 
	public void buy(Product p) {// 하나의 부모 타입 Person 참조변수이자 매개변수인 p로 다양한 자식객체를 전달받아 처리
		System.out.println(p.getClass().getName()+" 구매완료!");
	}
}
public class TestPolymorphism2 {
	public static void main(String[] args) {
		KostaMarketService service=new KostaMarketService();
		service.buy(new Food());
		service.buy(new Computer());
		service.buy(new Phone());   
	}
}
