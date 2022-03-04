package view;

import java.util.Scanner;

public class ConsoleUI {
	// private SchoolService service=new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() {
		exit: 
		while (true) {
			System.out.println("*******학사관리 프로그램을 시작합니다*******");
			System.out.println("1.추가 2.삭제 3.검색 4.전체회원보기 5.종료");
			String info=scanner.nextLine();
			switch(info) {
			case "1":
				System.out.println("1");
				break;
			case "2":
				System.out.println("2");
				break;
			case "3":
				System.out.println("3");
				break;
			case "4":
				System.out.println("4");
				break;
			case "5":
				System.out.println("*******학사관리프로그램을 종료합니다*******");
				break exit;
			default:
				System.out.println("잘못된 입력값입니다!");
			}
		}//while
			scanner.close();
		
		

	}// excute
}// ConsoleUI
