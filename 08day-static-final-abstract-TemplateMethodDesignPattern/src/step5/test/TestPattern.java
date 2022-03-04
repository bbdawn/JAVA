package step5.test;

import step5.common.PizzaService;
import step5.service.PotatoPizzaService;
import step5.service.SeaFoodPizzaService;

public class TestPattern {
	public static void main(String[] args) {
		//���� ���ڼ��� ��ü�� �θ�Ÿ���� �迭�� ����
		PizzaService[] array={new PotatoPizzaService(), new SeaFoodPizzaService()};
		for(int i=0; i<array.length; i++) {
			array[i].makePizza();
			System.out.println("*******************");
		}
	}

}
