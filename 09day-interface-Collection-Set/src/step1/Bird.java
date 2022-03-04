package step1;

public class Bird implements Flyer{

	@Override //Annotation-> 오버라이드 문법 체크
	public void fly() {
		System.out.println("새가 날다");
		
	}
	
}
