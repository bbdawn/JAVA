package step4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MemoService {
	//throws는 메서드 선언시 명시되는 Exception keyword로서
	//메서드 실행시 Exception이 발생되면 호출
	
	public void readMemo(String filePath) throws FileNotFoundException {
		//파일의 정보를 입력하는 객체
		
	FileReader fr=new FileReader(filePath);	
	System.out.println(filePath+"파일을 입력받는 작업");	
		
		
	}
}
