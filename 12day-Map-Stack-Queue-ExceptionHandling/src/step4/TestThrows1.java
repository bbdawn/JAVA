package step4;

import java.io.FileNotFoundException;

//throws�� Ư���� Ȯ��
//throws�� ����� �޼���(or������)�� ����ϱ� ���� ȣ���� ���
//1. throws 2.try catch �ΰ��� �� �����ؼ� �ڵ��۾��� �ؾ��Ѵ�. 
//����� Exception�߻��Ǵ� ��쿡�� ȣ���� ������ Exception�� ���ĵȴ�.
//�Ʒ� ���� ��쿡�� main �޼��忡�� �۾��� �����ϹǷ�
//throws���� try catch�� ���ܸ� ó���ϴ� ��������ۼ��� �ߴ�. 
//���ο��� try catch���� �ʰ� throws�� �ϴ� ���� TestThrows2���� Ȯ��

public class TestThrows1 {
	public static void main(String[] args) {
		MemoService service=new MemoService();
		String filePath="C:\\Users\\user\\Desktop\\kosta238";//�����ϴ� ����
		
		//�׽�Ʈ�� ���ؼ� �������� �ʴ� ���� ��θ� ���
		filePath="C:\\Users\\user\\Desktop\\kosta238";
		filePath="C:\\Users\\user\\Desktop\\kosta0";
		
		try {
			service.readMemo(filePath);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");
		
	}//main
}//class
