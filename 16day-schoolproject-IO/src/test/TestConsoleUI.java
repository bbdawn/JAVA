package test;

import view.ConsoleUI3;

public class TestConsoleUI {
	public static void main(String[] args) {
		//ConsoleUI1 ui=new ConsoleUI1();//step1 메뉴테스트
		//ConsoleUI2 ui=new ConsoleUI2();//step2 메뉴테스트
		ConsoleUI3 ui=new ConsoleUI3();//step3 구성원 추가 및 전체 구성원 보기
		//ConsoleUI4 ui=new ConsoleUI4();//step4 구성원 추가, 전체 구성원 보기, 검색
		//ConsoleUI5 ui=new ConsoleUI5();//step5 삭제
		//ConsoleUI6 ui=new ConsoleUI6();//step6 구성원 등록(추가)시 Tel 중복확인
		
		ui.execute();
	}
}

