package step5;

import java.util.Scanner;

public class TestConsoleInput2 {
	public static void main(String[] args) {
		/*
		 * �����ϴ� ���ø��� �Է��ϼ���: ���� 
		 * ���ø�: ���� 
		 * �����ϴ� ���ø��� �Է��ϼ���: ���� 
		 * ���ø�: ���� 
		 * �����ϴ� ���ø��� �Է��ϼ���: ����
		 * ���ø�: ���� 
		 * �����ϴ� ���ø��� �Է��ϼ���: ���� 
		 * ���α׷��� ����Ǿ����ϴ�
		 */
		/*
		 * while(true) { nextLine(); //�Է¹��� ������ ��� }if(){ break; } }
		 */
		Scanner s = new Scanner(System.in);
		while (true) {//���ѷ���
			System.out.print("�����ϴ� ���ø��� �Է��ϼ���: ");
			String city = s.nextLine();
		if (city.equals("����")) {
			System.out.println("���α׷��� ����Ǿ����ϴ�");
			break;
		}
		System.out.println("���ø�: " + city);
		}
		s.close();
	}
	}// main

