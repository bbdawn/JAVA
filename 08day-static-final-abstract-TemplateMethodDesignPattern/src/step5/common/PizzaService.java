package step5.common;

public abstract class PizzaService {
	protected void prepare() {
		System.out.println("���츦 �����");
	}
	
	protected abstract void topping(); //������ �ڽ�Ŭ������������ �����ؾ��ϹǷ� abstract ������ ������ ����
	protected void bake() {
		System.out.println("����");
	}
	
	protected void cutting() {
		System.out.println("�ڸ���");
	}
	
	protected void boxing() {
		System.out.println("�����ϴ�");
	}
	
	//Template Method : �۾�����(�˰����� ����)�� ������ �ڽĿ��� �����ش�
	public void makePizza() {
		prepare();
		topping();
		bake();
		cutting();
		boxing();
	}
}
