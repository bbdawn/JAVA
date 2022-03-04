package step6;

public class TestPrimitiveType {
	public static void main(String[] args) {
		//정수형 byte short int long
		byte by=1;
		System.out.println(by);
		//java se api 를 이용해 byte형의 최대값을 확인
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MIN_VALUE);//-128
		//byte by2=128; //errer : 128은 byte형의 최대값을 넘어서기 때문
		
		short s=128;
		System.out.println(s); //가능!
		
		int i=1;
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE); //2147483647 21억. 은행의 경우에는 불가능함.

		
		long lo=2147483648L;// int형의 범위를 넘어설 경우에는 long 형을 인식시켜야한다.
		System.out.println(lo);
	
		//실수형 float double
		//float f=3.14; //error : 실수형의 기본형은 double (8byte), float은 4byte, float임을 인식시켜야함
		float f=3.14F;
		System.out.println(f);
		double d=3.14;
		System.out.println(d);
		
		//문자형 - 한문자만 가능
		char ch='밥';
		System.out.println(ch);
		
		//논리형 - 오직 true와 false만 할당 가능
		boolean flag=true;
		flag=false;
		//flag=ok; //error : true or false만 가능
		System.out.println(flag);

		
		
		
		
	}
}
