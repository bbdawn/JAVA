package step9;

import java.util.Scanner;

public class TestIf2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("태어난 월을 입력하세요");
		int m=s.nextInt();
		MyDate d=new MyDate(m);
		int month=d.getMonth();
		if(month!=-1)
		System.out.println("당신은 "+month+"월에 태어났습니다");
		s.close();
	}
}
