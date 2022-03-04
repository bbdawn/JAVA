package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	private String path;// 인스턴스변수

	public OutputService(String path) {
		this.path = path;
	}

	/*
	 * path에 해당하는 파일을 생성하고 매개변수로 전달된 info를 출력하는 메서드 (예외는 호출한 측으로 throws 한다)
	 */
	public void writeInfo(String info) throws IOException {
		FileWriter fw = new FileWriter(path, true);// append true
		PrintWriter pw = new PrintWriter(fw);
		pw.println(info);
		pw.close();
	}
}// OutputService
