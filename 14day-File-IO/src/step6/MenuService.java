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
	// Scanner , FileWriter, PrintWriter ���� 
	// while
	// scanner.close()
	// pw.close() 
	//throws 
	public void orderMenu() throws IOException {
		Scanner s=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(new FileWriter(path));
		while(true) {
			System.out.print("����޴��� �ֹ��ϼ��� :");
			String menu=s.nextLine();			
			if(menu.equals("����")) {
				System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�");
				break;
			}
			pw.println(menu);
			System.out.println(menu+" �ֹ�");
		}
		pw.close();
		s.close();
	}	
}
/*
	����޴��� �ֹ��ϼ��� : ������ 
	������ �ֹ� 
	����޴��� �ֹ��ϼ��� : �ܹ��� 
	�ܹ��� �ֹ� 
	����޴��� �ֹ��ϼ��� : ���ø� 
	���ø� �ֹ� 
	����޴��� �ֹ��ϼ��� : ����
	�ֹ��� �Ϸ�Ǿ����ϴ� 
	
	iotest\menu.txt���� ������ ����Ǿ� �ִ� 
	������
	�ܹ���
	���ø� 
*/