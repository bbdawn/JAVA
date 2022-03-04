//Scanner, switch, case, default, s.close
package step1;

import java.util.Scanner;

public class TestSwitch1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("등급을 입력하세요: ");
		int grade=s.nextInt();
		//switch 구문
		//1이 입력되면 case 1이후의 모든 case와 default가 실행되는 구조.
		//grade=1; :: result : 하버드 옥스퍼드 MIT 북경대 -> 1등급이면 다 갈 수 있음.
		switch(grade) {
		case 1:
			System.out.println("하버드");
		case 2:
			System.out.println("옥스퍼드");
		case 3:
			System.out.println("MIT");
		default:
			System.out.println("북경대");
		}//switch
		s.close();
	}//main
}//class

