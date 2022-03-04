package step9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import common.Path;

public class CarService {
	private String path=Path.TEST_PATH+"carlist.obj";
	private ArrayList<Car> list=new ArrayList<Car>();
	// 매개변수로 전달된 Car 객체를 list 저장한다 
	public void addCar(Car car) {
		list.add(car);
	}
	// 리스트 객체를 직렬화하여 path 파일에 저장한다 
	public void saveList() throws FileNotFoundException, IOException {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(list);
		}finally {
			if(oos!=null)
				oos.close();
		}//finally
	}//method
	// path 파일에 저장된 리스트를 객체로 역직렬화해서 반환한다 
	@SuppressWarnings("unchecked") // 별도의 타입을 체크하지 않겠다는 의미의 어노테이션 
	public ArrayList<Car> loadList() throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<Car> list=null;
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream(path));
			list=(ArrayList<Car>) ois.readObject();
		}finally {
			if(ois!=null)
				ois.close();
		}
		return list;
	}
}











