package step5;

import java.util.Scanner;

public class TestConsoleInput2 {
	public static void main(String[] args) {
		/*
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
		 * while(true) { nextLine(); //입력받을 때까지 대기 }if(){ break; } }
		 */
		Scanner s = new Scanner(System.in);
		while (true) {//무한루프
			System.out.print("좋아하는 도시명을 입력하세요: ");
			String city = s.nextLine();
		if (city.equals("종료")) {
			System.out.println("프로그램이 종료되었습니다");
			break;
		}
		System.out.println("도시명: " + city);
		}
		s.close();
	}
	}// main

