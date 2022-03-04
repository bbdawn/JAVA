package step1;

public interface Flyer {
	String ID="javaking"; //ID 대문자로 쓰는 이유는 상수이기 때문(public static final_상수???)로 인식. 상수이고 meta space에 저장
	//위 라인처럼 명시하면 static final로 인식되므로 인스턴스변수를 명시하는 것은 불가능하다. 
	public void fly(); //abstract method로 인식
	
	//public void takeoff() {} //error: 구현된 메서드 정의 불가 -> {} 안됨!!
}
