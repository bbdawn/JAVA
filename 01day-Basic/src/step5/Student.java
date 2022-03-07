package step5;

public class Student {
	// Worker Method 
	public void study() {
		System.out.println("학생이 공부하다");
	}
	// Worker method : parameter 매개변수 
	public void study2(String subject) {
		System.out.println(subject+" 공부하다");
	}
	// Worker method : return value 
	public String study3(String subject) {
		String info=subject+" 열공하다";
		return info;//호출한 측으로 정보를 반환한다 
	}
}














