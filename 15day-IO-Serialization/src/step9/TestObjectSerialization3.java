package step9;

import java.io.IOException;

public class TestObjectSerialization3 {
	public static void main(String[] args) {
		CarService service=new CarService();
		service.addCar(new Car("k5",2000));
		service.addCar(new Car("SM6",2500));
		service.addCar(new Car("���",1000));
		//try
		try {
			service.saveList();
			System.out.println("**�ڵ��� ����Ʈ�� ����ȭ�Ͽ� ���Ͽ� ����**");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//catch
	}
}
