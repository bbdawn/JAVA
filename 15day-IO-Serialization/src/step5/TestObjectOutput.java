package step5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import common.Path;

public class TestObjectOutput {
	// ��ü ����ȭ�� ���� heap �޸𸮿� �ִ� ��ü�� 
	// �ܺ��� ���Ͽ� �����ϴ� ���� 
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream(Path.TEST_PATH+"person.obj");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(new Person("������","����",100));
			oos.close();
			System.out.println("��ü�� ����ȭ�Ͽ� ���Ͽ� ����");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










