package view;

import java.util.Scanner;

public class ConsoleUI {
	// private SchoolService service=new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() {
		exit: 
		while (true) {
			System.out.println("*******�л���� ���α׷��� �����մϴ�*******");
			System.out.println("1.�߰� 2.���� 3.�˻� 4.��üȸ������ 5.����");
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
				System.out.println("*******�л�������α׷��� �����մϴ�*******");
				break exit;
			default:
				System.out.println("�߸��� �Է°��Դϴ�!");
			}
		}//while
			scanner.close();
		
		

	}// excute
}// ConsoleUI
