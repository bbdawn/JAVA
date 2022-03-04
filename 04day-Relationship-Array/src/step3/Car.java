package step3;

public class Car {
	private String model;
	private Engine engine;
	public Car(String model) { //������ ����
		this.model=model;
		//composition �����̹Ƿ� Car ��ü �����Ǵ��߿� Engine ��ü�� �����ؼ� �Ҵ��Ѵ�
		//�׷��� Heap�� Engine ��ü ���� ��������� Car ��ü �������
		this.engine=new Engine("�ͺ�",2000);
	}
	//getter-setter
	public Engine getEngine() {
		return engine; //engine ��ü�� �ּҰ��� ��ȯ�ϰԵ�
	}
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
