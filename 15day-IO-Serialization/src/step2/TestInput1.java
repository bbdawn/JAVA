package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import common.Path;

public class TestInput1 {
	public static void main(String[] args) {
		// ������ ������ �Է¹޴� ���� 		
		try {// ���Ͽ� ����Ǵ� Node Stream
			FileReader fr=new FileReader(Path.TEST_PATH+"order.txt");
			// �Ѷ��ξ� �Է¹޴� Processing Stream 
			BufferedReader br=new BufferedReader(fr);
			//�Ѷ��ξ� �о�� ���� 
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());//�� �̻� ���� ������ ������ null �� ��ȯ 
			br.close();//Processing Stream�� close �ϸ� �ȴ� 
			System.out.println("�Է¿Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}












