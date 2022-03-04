package step6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import common.Path;
import step5.Person;

public class TestObjectInput {
	/*
	 * 객체 역직렬화를 통해  파일(person.obj) 에 저장된 정보를 heap 메모리 영역으로 복원하는 예제 
	 */
	public static void main(String[] args) {
		try { // File에 연결되는 NodeStream
			FileInputStream fis=new FileInputStream(Path.TEST_PATH+"person.obj");
			// 객체로 복원하는 ProcessingStream 
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			Person p=(Person)obj;
			System.out.println(p.getName()+" "+p.getAddress()+" "+p.getMoney());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}




