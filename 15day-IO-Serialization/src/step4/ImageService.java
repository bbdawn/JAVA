package step4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	private String copyPath;
	private String pastePath;
	public ImageService(String copyPath, String pastePath) {
		super();
		this.copyPath = copyPath;
		this.pastePath = pastePath;
	}
	public void copyAndPasteImage() throws IOException {
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			bis=new BufferedInputStream(new FileInputStream(copyPath));//�Է½�Ʈ��
			bos=new BufferedOutputStream(new FileOutputStream(pastePath));//��½�Ʈ��
			int data=bis.read();
			while(data!=-1) { // -1 �� �� �̻� ���� ������ ���� �� read()�� -1�� ��ȯ, -1�� �ƴҵ��� �ݺ�
				//�ּ� Ȯ���ϼ���^^
				bos.write(data);//���
				data=bis.read();//�� ����Ʈ�� �Է�
			}
		}finally {
			if(bis!=null)
				bis.close();
			if(bos!=null)
				bos.close();
		}		
	}//method	
}//class
















