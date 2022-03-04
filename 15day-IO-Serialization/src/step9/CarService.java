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
	// �Ű������� ���޵� Car ��ü�� list �����Ѵ� 
	public void addCar(Car car) {
		list.add(car);
	}
	// ����Ʈ ��ü�� ����ȭ�Ͽ� path ���Ͽ� �����Ѵ� 
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
	// path ���Ͽ� ����� ����Ʈ�� ��ü�� ������ȭ�ؼ� ��ȯ�Ѵ� 
	@SuppressWarnings("unchecked") // ������ Ÿ���� üũ���� �ʰڴٴ� �ǹ��� ������̼� 
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











