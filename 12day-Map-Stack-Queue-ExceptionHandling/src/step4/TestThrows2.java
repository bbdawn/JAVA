package step4;

import java.io.FileNotFoundException;

//main���� throws�ϴ� ����
//Ư¡
public class TestThrows2 {
	//JVM�� ����ÿ� Exception �߻��Ǿ� �Ʒ��� ���α׷� ���� ����
	//�κ��� ������� �ʰ� ����ȴ� �� ����ó���� ���� ���� �ڵ�
	//TestThrows1 ���ó�� ���ο����� try catch�� ó���ϴ� ���� ����
	
	public static void main(String[] args) throws FileNotFoundException {
			MemoService service=new MemoService();
			String filePath="C:\\Users\\user\\Desktop\\kosta238";//�����ϴ� ����
			
			//�׽�Ʈ�� ���ؼ� �������� �ʴ� ���� ��θ� ���
			filePath="C:\\Users\\user\\Desktop\\kosta0";
		
			service.readMemo(filePath);
			System.out.println("���α׷� ���� ����");
			

	}//main
}
