//scanner

package step5;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput {
	public static void main(String[] args) {
		InputStream is = System.in;// 콘솔로부터 입력받는 입력스트림(장치에 연결되어있으므로 NodeStream계열)
		// 기능을 지원하는 ProcessingStream계열 -> Scanner
		Scanner s = new Scanner(is);
		System.out.print("친구 이름을 입력하세요: ");
		String name = s.nextLine();// 입력정보를 한라인씩 입력받는다.
		System.out.println("친구이름: " + name);
		s.close();// 입출력시에는 반드시 close 해줌!!

	}// main
}
