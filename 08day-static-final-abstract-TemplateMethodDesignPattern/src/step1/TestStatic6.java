package step1;

public class TestStatic6 {

	public static void main(String[] args) {
		//javase api에서 제공하는 static member를 사용해본다
		System.out.println(Short.MAX_VALUE);//static이므로 클래스명, 멤버로 접근
		String s1="2";
		String s2="8";
		System.out.println(s1+s2);//28 -> 문자열을 합쳤기 때문
		//문자열을 정수형으로 변환
		int i=Integer.parseInt(s1); //static method이므로 클래스명으로 접근하면 된다
		int j=Integer.parseInt(s2);
		System.out.println(i+j);
	}

}
