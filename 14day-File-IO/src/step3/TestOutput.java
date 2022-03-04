package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		// 일 생성하고 파일에 문자열을 출력하는 예제 -> Writer 계열(출력문자열스트림)
		// NodeStream : 직접 장치에 연결 -> FileWriter
		// ProcessingStream : 다양한 기능을 제공 -> PrintWriter(println(): 한 라인씩 문자열 출력)

		// 아래 FileWriter가 실행되면 경로에 해당하는 파일이 없으면 생성한다
		try {
			String path="C:" + File.separator + "kosta238" + File.separator + "iotest" + File.separator + "output.txt";
			FileWriter fw = new FileWriter(path,true);//true:append_누적 기능
			PrintWriter pw=new PrintWriter(fw);
			pw.println("진미평양냉면");
			pw.close();//스트림을 닫아준다 (닫기 전에 먼저 버퍼에 있는 정보를 flush_배출한다)
			System.out.println("출력 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}//catch
	}// main
}
