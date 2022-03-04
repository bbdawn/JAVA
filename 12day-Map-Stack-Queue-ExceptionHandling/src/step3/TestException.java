package step3;

/*
 * case1
 * 프로그램 실행시 Exception상황이 발생되면 
 * JVM은 Exception 발생시키고 프로그램이 즉시 종료되는 것을 확인하는 예제
 */

public class TestException {
	public static void main(String[] args) {
		
		String name="아이유";
		//문자열 길이 구하는 메서드 length();
		//test를 위해 name에 null을 할당해본다
		name=null;
		System.out.println(name.length()); //NullPointException발생되고 메세지 출력 후 즉시 종료됨. 
		System.out.println("프로그램 정상 수행");
	}
}
