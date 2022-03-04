package step4;

import java.io.IOException;

import common.Path;
/*
 * 		ByteStream ( 1byte ) 
 * 		: �̹��� , ������ , ��ü�� �޸� ������ ���� �͵��� 
 * 		  ByteStream �迭�� InputStream , OutputStream �� 
 * 		  �ڽ� Ŭ���� ��Ʈ���� �̿��ؾ� �Ѵ� 
 * 		�� ������ �̹����� �����ؼ� �ٸ� ���丮�� �ٿ��ֱ��ϴ� 
 * 		����� �����ϱ� ���� ���� 
 */
public class TestImageCopyAndPaste {
	public static void main(String[] args) {
		String copyPath=Path.TEST_PATH+"iu.jfif";
		//�����ϴ� �� Ȯ��  
		//System.out.println(new File(copyPath).exists());
		String pastePath=Path.TEST_PATH2+"���纻-iu.jfif";
		ImageService service=new ImageService(copyPath,pastePath);
		try {
			service.copyAndPasteImage();
			System.out.println("�̹��� ���ٿϷ�^^");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}










