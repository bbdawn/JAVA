package step5.service;

//ctrl+shift+o
import step5.common.PizzaService;

public class PotatoPizzaService extends PizzaService{
	//�θ��� abstract method�� �����Ѵ�.
	//���� �������� ������ �ڽ� ���� abstract class�� ����Ǿ���Ѵ� 
	//                      		-> abstract class�� ����Ǹ� ��ü�����Ұ�
	@Override //Annotation ������̼� -> �����ϰ� ����� ������ �ִ� �ǹ��ִ� �ּ�
	//@Override Annotation : �����Ͻÿ� �������̵� ������ üũ�ϴ� ������ ��. 
	public void topping() {
		System.out.println("��������");
		
	}

}
