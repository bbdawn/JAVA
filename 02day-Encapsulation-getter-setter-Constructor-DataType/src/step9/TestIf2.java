package step9;

import java.util.Scanner;

public class TestIf2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("�¾ ���� �Է��ϼ���");
		int m=s.nextInt();
		MyDate d=new MyDate(m);
		int month=d.getMonth();
		if(month!=-1)
		System.out.println("����� "+month+"���� �¾���ϴ�");
		s.close();
	}
}
