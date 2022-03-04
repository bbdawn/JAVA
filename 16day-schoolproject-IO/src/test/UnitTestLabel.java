package test;

import java.util.Scanner;

//제어문에서 label 사용 예제
public class UnitTestLabel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		exit: //label -> break레이블명을 명시하면 아래의 while문을 벗어날 수 있다 
		while(true) {
			System.out.println("1.등록 2.종료");
			String info=s.nextLine();
			switch(info) {
			case "1":
				System.out.println("등록작업진행");
				break;//현재 자신의 switch문을 벗어남
			case "2":
				System.out.println("종료");
				break exit;//while문을 벗어나고자 한다면 label을 이용한다. 
			}
		}
		s.close();
	}//main
}
