//step1
package view;

import java.util.Scanner;

public class ConsoleUI1 {
	private Scanner scanner=new Scanner(System.in);	
	public void execute() {
		System.out.println("*******�л�������α׷��� �����մϴ�********");
		System.out.println("1.�߰� 2.���� 3.�˻� 4.��üȸ������ 5.����");
		String menu=scanner.nextLine();
		switch(menu) {
		case "5":
			System.out.println("******�л�������α׷��� �����մϴ�*******");
		}	
		scanner.close();
	}
}
