package test;

import java.util.Scanner;

//������� label ��� ����
public class UnitTestLabel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		exit: //label -> break���̺���� ����ϸ� �Ʒ��� while���� ��� �� �ִ� 
		while(true) {
			System.out.println("1.��� 2.����");
			String info=s.nextLine();
			switch(info) {
			case "1":
				System.out.println("����۾�����");
				break;//���� �ڽ��� switch���� ���
			case "2":
				System.out.println("����");
				break exit;//while���� ������� �Ѵٸ� label�� �̿��Ѵ�. 
			}
		}
		s.close();
	}//main
}
