package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import common.Path;

public class TestInput2 {
	public static void main(String[] args) {
		// 파일의 정보를 입력받는 예제 		
		try {// 파일에 연결되는 Node Stream
			FileReader fr=new FileReader(Path.TEST_PATH+"order.txt");
			// 한라인씩 입력받는 Processing Stream 
			BufferedReader br=new BufferedReader(fr);
			
			String data=null;
			do {
				data=br.readLine();
				if(data!=null)
				System.out.println(data);
			}while(data!=null);
			
			br.close();//Processing Stream만 close 하면 된다 
			System.out.println("입력완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}












