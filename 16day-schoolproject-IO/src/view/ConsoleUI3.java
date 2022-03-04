//step1
package view;

import java.util.Scanner;

import model.DuplicateTelException;
import model.Member;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class ConsoleUI3 {
	//private SchoolService service=new SchoolService();
	private Scanner scanner = new Scanner(System.in);
	private SchoolService service=new SchoolService();

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
				System.out.println("**��ü ����������**");
				service.printAll();
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
		System.out.println("�Է��� ������ ������ �����ϼ��� 1.�л� 2.������ 3.����");
		String type=scanner.nextLine();
		System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���");
		String tel=scanner.nextLine();
		System.out.println("2. �̸��� �Է��ϼ���");
		String name=scanner.nextLine();
		System.out.println("3. �ּҸ� �Է��ϼ���");
		String address=scanner.nextLine();
		
		//type���� ������ �޼����� ����ؾ��Ѵ� 
		Member member=null;
		switch(type) {
		case "1": 
			System.out.println("4. �й��� �Է��ϼ���");
			String stdId=scanner.nextLine();
			member=new Student(tel,name,address,stdId);
			break;
		case "2":
			System.out.println("4. ������ �Է��ϼ���");
			String subject=scanner.nextLine();
			member=new Teacher(tel,name,address,subject);
			break;
		case "3":
			System.out.println("4. �μ��� �Է��ϼ���");
			String department=scanner.nextLine();
			member=new Teacher(tel,name,address,department);
			break;
		}//switch
		//����ڿ��� �Է¹��� ������ ������ �����ϱ� ���� SchoolService�� addMember()�� ȣ���Ѵ�
		try {
			service.addMember(member);
			System.out.println("����Ʈ�� �߰�: "+member);//���������� ��ϵ� ��� ��ϵ� �������� ������ �����ش�
		} catch (DuplicateTelException e) {//tel�� �ߺ��� ��� 
			System.out.println(e.getMessage());//tel�� �ߺ��Ǿ� ��ϺҰ� �޼����� �����ش�
		}
		
		
	}//method

	private void deleteView() {
		
	}

	private void findView() {
		
	}

	
}
