package step9;

import java.util.Scanner;

//���ǹ� ����
public class TestIf {
	public static void main(String[] args) {
		//����Ű ctrl+shift
		Scanner s=new Scanner(System.in); //�ַܼκ��� ������ �Է¹ޱ� ���� ��ü
		System.out.println("���̸� �Է��ϼ���");
		int age=s.nextInt();
		if(age>19) {
			System.out.println(age+"�� ����");
		}else if(age>13){
			System.out.println(age+"�� û�ҳ�");
		}else {
			System.out.println("���");
		}
		s.close();
	}
}
