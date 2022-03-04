package step6;

public class TestStringEqulas {
	public static void main(String[] args) {
		//문자열비교
		String s1="아이유";
		String s2="아이유";
		System.out.println(s1==s2); //true
		
		String s3=new String("아이유");
		System.out.println(s1==s3); //false //문자열 비교가 되지 않는다 
		StringBuilder sb=new StringBuilder("아이유"); 
		System.out.println(s1==sb.toString());//false //문자열 비교가 되지 않는다
		
		System.out.println(s1.equals(s3)); //true //문자열 비교 가능!!
		System.out.println(s1.equals(sb.toString())); //true //문자열 비교 가능!!
	}

}
