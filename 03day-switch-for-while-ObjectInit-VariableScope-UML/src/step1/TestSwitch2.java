//switch + break
//case 3: case 4: case 5:
package step1;

import java.util.Scanner;

public class TestSwitch2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("����� �Է��ϼ���: ");
		int grade=s.nextInt();
		//TestSwitch1���� �ٸ��� �ش� ��޸� ��µǵ��� �Ѵ�
		switch(grade) {
		case 1:
			System.out.println("�Ϲ���");
			break;//�ش� switch ������ �����Ѵ�
		case 2:
			System.out.println("�����۵�");
			break;
		case 3: case 4: case 5:
			System.out.println("MIT");
			break;
		default://default�� break �ʿ� ����
			System.out.println("�ϰ��");
		}//switch
		s.close();
	}//main
}//class
