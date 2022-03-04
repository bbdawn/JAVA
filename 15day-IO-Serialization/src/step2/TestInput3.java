package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import common.Path;

public class TestInput3 {
	public static void main(String[] args) {
		// 파일의 정보를 입력받는 예제 		
		try {// 파일에 연결되는 Node Stream
			FileReader fr=new FileReader(Path.TEST_PATH+"order.txt");
			// 한라인씩 입력받는 Processing Stream 
			BufferedReader br=new BufferedReader(fr);
			
			//BufferdReader 의 ready() -> 읽을 내용이 있으면 true 없으면 false 
			while(br.ready()) // 제어문의 실행문이 한라인이면 { } 생략 가능 
				System.out.println(br.readLine());
			
			br.close();//Processing Stream만 close 하면 된다 
			System.out.println("입력완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}












