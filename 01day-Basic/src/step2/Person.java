package step2; // 패키지 - 디렉토리별로 클래스를 분류해 관리 
// 클래스 정의 
/*
 *  public : 가장 넓은 범위의 접근 제어자 ( 다른 패키지 , 다른 클래스에서 접근 가능 ) 
 *  class : class 정의를 위한 자바 키워드 ( 예약어 ) 
 *  Person : class name , 대문자로 시작 
 */
public class Person {
	/*
	 * 변수 ( instance(실재) variable ) - 객체의 속성을 저장 
	 */
	String name="아이유";
	/*
	 * 메서드 ( method ) - 객체의 기능을 정의 
	 */
	public void eat() {
		System.out.println(name+" 먹다");
	}
}









