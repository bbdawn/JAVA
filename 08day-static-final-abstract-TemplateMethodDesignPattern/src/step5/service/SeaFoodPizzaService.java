package step5.service;

import step5.common.PizzaService;

public class SeaFoodPizzaService extends PizzaService{

	@Override //Annotation -> @Override �������̵� ������ üũ
	//�θ��� abstract method�� ����
	protected void topping() {
		System.out.println("�ػ깰����");
	}
	

}
