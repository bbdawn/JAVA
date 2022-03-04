package step5;

import java.util.Scanner;

public class TestConsoleInput3 {
	public static void main(String[] args) {
		/*
		 * TestConsoleInput2와 같은 기능
		 * do-while로 구현
		 * 좋아하는 도시명을 입력하세요: 양주 
		 * 도시명: 양주 
		 * 좋아하는 도시명을 입력하세요: 속초 
		 * 도시명: 속초 
		 * 좋아하는 도시명을 입력하세요: 목포
		 * 도시명: 목포 
		 * 좋아하는 도시명을 입력하세요: 종료 
		 * 프로그램이 종료되었습니다
		 */
		/*
		 * scanner
		 *do{
		 *
		 *}while();//종료가 아닐때까지 계속 반복
		 */
		
			
		
		//여기부터
		
		Scanner s = new Scanner(System.in);
		String city=null;//local variable은 선언된 자신의 실행영역{}내에서만 사용가능하므로 여기에서 선언한다
		do {
			System.out.print("좋아하는 도시: ");
			city = s.nextLine();
			if(city.equals("종료")==false)//종료가 아닐때만 출력한다
			System.out.println("도시명: " + city);
		}while(city.equals("종료")==false);{//종료가 아닐동안 계속 반복한다
		System.out.println("프로그램이 종료되었습니다");
		s.close();
		}
	}
	}// main

