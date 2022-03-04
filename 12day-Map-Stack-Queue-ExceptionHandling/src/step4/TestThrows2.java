package step4;

import java.io.FileNotFoundException;

//main에서 throws하는 예제
//특징
public class TestThrows2 {
	//JVM이 실행시에 Exception 발생되어 아래의 프로그램 정상 수행
	//부분은 실행되지 않고 종료된다 즉 예외처리가 되지 않은 코드
	//TestThrows1 방식처럼 메인에서는 try catch로 처리하는 것을 권장
	
	public static void main(String[] args) throws FileNotFoundException {
			MemoService service=new MemoService();
			String filePath="C:\\Users\\user\\Desktop\\kosta238";//존재하는 파일
			
			//테스트를 위해서 존재하지 않는 파일 경로를 명시
			filePath="C:\\Users\\user\\Desktop\\kosta0";
		
			service.readMemo(filePath);
			System.out.println("프로그램 정상 수행");
			

	}//main
}
