//step1
package view;

import java.util.Scanner;

public class ConsoleUI2 {
	//private SchoolService service=new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() {
		exit: while (true) {
			System.out.println("*******�л�������α׷��� �����մϴ�********");
			System.out.println("1.�߰� 2.���� 3.�˻� 4.��üȸ������ 5.����");
			String menu = scanner.nextLine();
			switch (menu) {
			case "1":
				addView();
				break;
			case "2":	
				deleteView();
				break;
			case "3":
				findView();
				break;
			case "4":
				System.out.println("��ü ����Ʈ����");
				break;
			case "5":
				System.out.println("******�л�������α׷��� �����մϴ�*******");
				break exit;// switch���� �ƴ϶� exit label�� ������ while���� �����
			default:
				System.out.println("�߸��� �Է°��Դϴ�!!");
			}// switch
		} // while
		scanner.close();
	}
	
	private void addView() {
		
	}

	private void deleteView() {
		
	}

	private void findView() {
		
	}

	
}
