package step5.test;

import step5.common.PizzaService;
import step5.service.PotatoPizzaService;
import step5.service.SeaFoodPizzaService;

public class TestPattern {
	public static void main(String[] args) {
		//여러 피자서비스 객체를 부모타입의 배열에 저장
		PizzaService[] array={new PotatoPizzaService(), new SeaFoodPizzaService()};
		for(int i=0; i<array.length; i++) {
			array[i].makePizza();
			System.out.println("*******************");
		}
	}

}
