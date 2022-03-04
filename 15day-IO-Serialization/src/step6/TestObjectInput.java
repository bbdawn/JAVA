package step6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import common.Path;
import step5.Person;

public class TestObjectInput {
	/*
	 * ��ü ������ȭ�� ����  ����(person.obj) �� ����� ������ heap �޸� �������� �����ϴ� ���� 
	 */
	public static void main(String[] args) {
		try { // File�� ����Ǵ� NodeStream
			FileInputStream fis=new FileInputStream(Path.TEST_PATH+"person.obj");
			// ��ü�� �����ϴ� ProcessingStream 
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




