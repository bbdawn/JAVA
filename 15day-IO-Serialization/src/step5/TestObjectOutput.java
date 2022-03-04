package step5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import common.Path;

public class TestObjectOutput {
	// 객체 직렬화를 통해 heap 메모리에 있는 객체를 
	// 외부의 파일에 저장하는 예제 
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream(Path.TEST_PATH+"person.obj");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(new Person("아이유","용인",100));
			oos.close();
			System.out.println("객체를 직렬화하여 파일에 전송");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










