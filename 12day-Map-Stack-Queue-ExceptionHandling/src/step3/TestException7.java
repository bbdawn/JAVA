package step3;

import java.util.Scanner;

public class TestException7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);// system.in�ֿܼ��� �Է����� ��ü
		System.out.print("���̸� �Է��ϼ��� ");
		String info = s.nextLine();// �� ���ξ� ������ �Է¹޴´�

		try {
		int age = Integer.parseInt(info);
		if (age > 19) {
			System.out.println("����� �����Դϴ�");
		} else {
			System.out.println("����� �̼����Դϴ�");
		}
		}catch(NumberFormatException E) {
			System.out.println("���̸� ���� �������� �Է��ϼ���");
		}finally {//����� �ڿ��� ������� �� �ݵ�� �ڿ������� �����ϵ��� close ���ֱ� ���� finally�� ���.  
			s.close();
		}

	}// main
}// class
