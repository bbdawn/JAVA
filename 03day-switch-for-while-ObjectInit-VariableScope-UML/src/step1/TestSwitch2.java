//switch + break
//case 3: case 4: case 5:
package step1;

import java.util.Scanner;

public class TestSwitch2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("등급을 입력하세요: ");
		int grade=s.nextInt();
		//TestSwitch1과는 다르게 해당 등급만 출력되도록 한다
		switch(grade) {
		case 1:
			System.out.println("하버드");
			break;//해당 switch 구문을 종료한다
		case 2:
			System.out.println("옥스퍼드");
			break;
		case 3: case 4: case 5:
			System.out.println("MIT");
			break;
		default://default는 break 필요 없음
			System.out.println("북경대");
		}//switch
		s.close();
	}//main
}//class
