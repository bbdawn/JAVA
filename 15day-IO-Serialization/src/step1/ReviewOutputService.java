package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReviewOutputService {
	private String path;

	public ReviewOutputService(String path) {
		super();
		this.path = path;
	}

	public void order() throws IOException {
		// local variable 은 선언된 자신의 영역내에서만 사용할 수 있으므로
		// finally에서 scanner와 pw 를 close하기 위해 현재 위치에 선언, 초기화한다
		Scanner scanner = null;
		PrintWriter pw = null;
		try {
			scanner = new Scanner(System.in);// 콘솔에서 입력받기 위한 스트림
			pw = new PrintWriter(new FileWriter(path),true);// PrintWriter true -> autoflush ( println() 즉시 출력 )
			while(true) {
				System.out.print("메뉴 주문하세요:");
				String food=scanner.nextLine();
				if(food.equals("종료")) {
					System.out.println("주문이 완료되었습니다");
					break; // while 문을 종료한다 
				}
				pw.println(food);
				System.out.println(food+" 주문");
			}
			
		} finally { // 메서드 실행 완료전에 반드시 Stream 을 close 하기 위해 finally에 작성 
			if (scanner != null)
				scanner.close();
			if (pw != null)
				pw.close();
		}
	}// method
}// class











