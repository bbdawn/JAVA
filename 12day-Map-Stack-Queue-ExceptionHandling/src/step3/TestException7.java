package step3;

import java.util.Scanner;

public class TestException7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);// system.in콘솔에서 입력위한 객체
		System.out.print("나이를 입력하세요 ");
		String info = s.nextLine();// 한 라인씩 정보를 입력받는다

		try {
		int age = Integer.parseInt(info);
		if (age > 19) {
			System.out.println("당신은 성인입니다");
		} else {
			System.out.println("당신은 미성년입니다");
		}
		}catch(NumberFormatException E) {
			System.out.println("나이를 정수 포맷으로 입력하세요");
		}finally {//입출력 자원을 사용했을 때 반드시 자원점유를 해제하도록 close 해주기 위해 finally에 명시.  
			s.close();
		}

	}// main
}// class
