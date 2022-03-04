package step3;

public class TestSettterGetter2 {
	public static void main(String[] args) {
		// setter getter를 tool로 만들어서 테스트 해보기
		KostaMember m=new KostaMember();
		m.setId("javaking");
		System.out.println(m.getId());
		m.setPassword("abcd");
		System.out.println(m.getPassword());
		
		
	}
}
