package step6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {
	private String path;
	public MenuService(String path) {
		super();
		this.path = path;
	}
	// Scanner , FileWriter, PrintWriter 생성 
	// while
	// scanner.close()
	// pw.close() 
	//throws 
	public void orderMenu() throws IOException {
		Scanner s=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(new FileWriter(path));
		while(true) {
			System.out.print("저녁메뉴를 주문하세요 :");
			String menu=s.nextLine();			
			if(menu.equals("종료")) {
				System.out.println("주문이 완료되었습니다");
				break;
			}
			pw.println(menu);
			System.out.println(menu+" 주문");
		}
		pw.close();
		s.close();
	}	
}
/*
	저녁메뉴를 주문하세요 : 마라탕 
	마라탕 주문 
	저녁메뉴를 주문하세요 : 햄버거 
	햄버거 주문 
	저녁메뉴를 주문하세요 : 평양냉면 
	평양냉면 주문 
	저녁메뉴를 주문하세요 : 종료
	주문이 완료되었습니다 
	
	iotest\menu.txt에는 정보가 저장되어 있다 
	마라탕
	햄버거
	평양냉면 
*/