package step4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MemoService {
	//throws�� �޼��� ����� ��õǴ� Exception keyword�μ�
	//�޼��� ����� Exception�� �߻��Ǹ� ȣ��
	
	public void readMemo(String filePath) throws FileNotFoundException {
		//������ ������ �Է��ϴ� ��ü
		
	FileReader fr=new FileReader(filePath);	
	System.out.println(filePath+"������ �Է¹޴� �۾�");	
		
		
	}
}
