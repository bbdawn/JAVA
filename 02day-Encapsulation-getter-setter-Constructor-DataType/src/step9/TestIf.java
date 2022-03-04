package step9;

import java.util.Scanner;

//조건문 연습
public class TestIf {
	public static void main(String[] args) {
		//단축키 ctrl+shift
		Scanner s=new Scanner(System.in); //콘솔로부터 정보를 입력받기 위한 객체
		System.out.println("나이를 입력하세요");
		int age=s.nextInt();
		if(age>19) {
			System.out.println(age+"세 성인");
		}else if(age>13){
			System.out.println(age+"세 청소년");
		}else {
			System.out.println("어린이");
		}
		s.close();
	}
}
