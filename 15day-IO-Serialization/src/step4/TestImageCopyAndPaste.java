package step4;

import java.io.IOException;

import common.Path;
/*
 * 		ByteStream ( 1byte ) 
 * 		: 이미지 , 동영상 , 객체의 메모리 정보와 같은 것들은 
 * 		  ByteStream 계열의 InputStream , OutputStream 의 
 * 		  자식 클래스 스트림을 이용해야 한다 
 * 		이 예제는 이미지를 복사해서 다른 디렉토리에 붙여넣기하는 
 * 		기능을 연습하기 위한 예제 
 */
public class TestImageCopyAndPaste {
	public static void main(String[] args) {
		String copyPath=Path.TEST_PATH+"iu.jfif";
		//존재하는 지 확인  
		//System.out.println(new File(copyPath).exists());
		String pastePath=Path.TEST_PATH2+"복사본-iu.jfif";
		ImageService service=new ImageService(copyPath,pastePath);
		try {
			service.copyAndPasteImage();
			System.out.println("이미지 복붙완료^^");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}










