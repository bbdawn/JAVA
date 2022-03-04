package step9;

import java.io.IOException;
import java.util.ArrayList;

public class TestObjectSerialization4 {
	public static void main(String[] args) {
		CarService service = new CarService();		
		
		try {
			ArrayList<Car> list= service.loadList();
			for (int i = 0; i < list.size(); i++) { // 3대가 출력
				System.out.println(list.get(i).getModel() 
						+ " " + list.get(i).getPrice());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// catch
	}
}
