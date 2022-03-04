package step4;

public class TestHasA {
	public static void main(String[] args) {
		//메인 메서드의 코드가 실행되도록 클래스를 구현해보는 연습
		School school=new School("코스타초등학교");
		//result: 코스타초등학교
		System.out.println(school.getName()); 
		school.setBus(new Bus("현대",30));
		
		//result: 현대
		System.out.println(school.getBus().getMaker());
		//result: 30
		System.out.println(school.getBus().getCount());
		
	}
	
	
	
	
	
}
