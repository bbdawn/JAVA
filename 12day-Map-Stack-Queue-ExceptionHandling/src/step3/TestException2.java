package step3;

/*
 * case2
 * TestException1에서는 Exception발생하고 즉시 종료되었는데
 * TestException2에서는 ExceptionHandling(예외처리)해서 Exception발생시 Exception에 대한 
 * 대안흐름or대처방안or처리를 통해 대안흐름을 실행한 후 프로그램을 정상수행시켜본다
 * 
 * try{
 * 	예외 발생 예상 지점 
 * }catch(Exception e}{
 * 	예외 발생시 실행할 대안 코드 영역
 * }
 */

public class TestException2 {
	public static void main(String[] args) {
		
		String name="아이유";
		//문자열 길이 구하는 메서드 length();
		//test를 위해 name에 null을 할당해본다
		name=null;
		try {
		System.out.println(name.length()); //NullPointException발생되고 메세지 출력 후 즉시 종료됨. 
		}catch(NullPointerException e) {
			System.out.println("name이 null이므로 길이를 구할 수 없습니다 -> 대안 실행");
		}	
		System.out.println("프로그램 정상 수행");
	}
}
