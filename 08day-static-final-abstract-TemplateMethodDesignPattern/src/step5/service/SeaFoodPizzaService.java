package step5.service;

import step5.common.PizzaService;

public class SeaFoodPizzaService extends PizzaService{

	@Override //Annotation -> @Override 오버라이드 문법을 체크
	//부모의 abstract method를 구현
	protected void topping() {
		System.out.println("해산물토핑");
	}
	

}
