package step7.model;

public class TestAccessModifier2 {

	public static void main(String[] args) {
		// 동일한 패키지내에서 접근 테스트 
		// 예상 - 접근가능 
		Customer c=new Customer();
		System.out.println(c.password1);
		System.out.println(c.password2);
		System.out.println(c.password3);
		//private 은 외부(다른 클래스)에서 접근불가
		//System.out.println(c.password4);
	}

}
