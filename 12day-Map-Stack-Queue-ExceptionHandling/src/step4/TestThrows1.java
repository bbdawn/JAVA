package step4;

import java.io.FileNotFoundException;

//throws의 특성을 확인
//throws가 선언된 메서드(or생성자)를 사용하기 위해 호출할 경우
//1. throws 2.try catch 두가지 중 택일해서 코드작업을 해야한다. 
//실행시 Exception발생되는 경우에는 호출한 측으로 Exception이 전파된다.
//아래 같은 경우에는 main 메서드에서 작업을 진행하므로
//throws보다 try catch로 에외를 처리하는 방식으로작성을 했다. 
//메인에서 try catch하지 않고 throws를 하는 예는 TestThrows2에서 확인

public class TestThrows1 {
	public static void main(String[] args) {
		MemoService service=new MemoService();
		String filePath="C:\\Users\\user\\Desktop\\kosta238";//존재하는 파일
		
		//테스트를 위해서 존재하지 않는 파일 경로를 명시
		filePath="C:\\Users\\user\\Desktop\\kosta238";
		filePath="C:\\Users\\user\\Desktop\\kosta0";
		
		try {
			service.readMemo(filePath);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 수행");
		
	}//main
}//class
