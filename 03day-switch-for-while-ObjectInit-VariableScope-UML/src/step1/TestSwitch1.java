//Scanner, switch, case, default, s.close
package step1;

import java.util.Scanner;

public class TestSwitch1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("����� �Է��ϼ���: ");
		int grade=s.nextInt();
		//switch ����
		//1�� �ԷµǸ� case 1������ ��� case�� default�� ����Ǵ� ����.
		//grade=1; :: result : �Ϲ��� �����۵� MIT �ϰ�� -> 1����̸� �� �� �� ����.
		switch(grade) {
		case 1:
			System.out.println("�Ϲ���");
		case 2:
			System.out.println("�����۵�");
		case 3:
			System.out.println("MIT");
		default:
			System.out.println("�ϰ��");
		}//switch
		s.close();
	}//main
}//class

