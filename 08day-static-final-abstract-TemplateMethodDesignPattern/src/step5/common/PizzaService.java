package step5.common;

public abstract class PizzaService {
	protected void prepare() {
		System.out.println("도우를 만들다");
	}
	
	protected abstract void topping(); //토핑은 자식클래스차원에서 구현해야하므로 abstract 선언해 구현을 강제
	protected void bake() {
		System.out.println("굽다");
	}
	
	protected void cutting() {
		System.out.println("자르다");
	}
	
	protected void boxing() {
		System.out.println("포장하다");
	}
	
	//Template Method : 작업공정(알고리즘의 뼈대)을 정의해 자식에게 물려준다
	public void makePizza() {
		prepare();
		topping();
		bake();
		cutting();
		boxing();
	}
}
