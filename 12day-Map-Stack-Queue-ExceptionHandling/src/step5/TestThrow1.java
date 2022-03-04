package step5;
/*
 * Exception Handling : 예외 발생시 대처방안을 실행하고 프로그램 정상 수행
 * try: 예외 발생 예상 지점 블럭
 * catch : 예외처리, 대안흐름or대처방안
 * finally : 항상 실행(무슨일이 있어도 실행)
 * throws : 예외 발생 시 호출한 측으로 전파한다 (던진다_
 * 
 * throw: 예외를 고의로 발생 
 */

/* 
 * throw를 통한 예외 발생을 테스트하기 위해 별도의 AgeException class를 정의한다
 * 성인영화서비스에 입장시 나이가 19세 미만 미성년일 경우에 throw를 이용해
 * AgeException을 발생시키고 메서드에 throws를 명시해 호출한 측으로 해당 예외를 전파한다
 * 19세 이상 성년일 경우에는 정상적으로 영화 관람이 되도록 서비스한다. 
 */
public class TestThrow1 {
	public static void main(String[] args) {
		MovieService service=new MovieService();
		int age=11;
		//age=22;
		try {
			service.enter(age);
		} catch (AgeException e) {
			
			//e.printStackTrace();//예외 메세지와 전체 발생 경로를 출력
			System.out.println(e.getMessage());//예외 메세지만 반환
			
		}
		System.out.println("프로그램 정상 수행");
	
	
	
	}
}
