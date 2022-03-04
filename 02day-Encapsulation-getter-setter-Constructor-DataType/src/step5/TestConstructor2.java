package step5;

public class TestConstructor2 {
	public static void main(String[] args) {
		//1.아무 조건없이 신용카드 객체를 생성한다
		CreditCard c1=new CreditCard();
		//2.객체 생성 후 개인정보를 할당한다
		c1.setPersonalInfo("아이유 개인정보");
		System.out.println(c1.getPersonalInfo());
		
		System.out.println("***********");
		
		//밑 코드 error : 개인정보를 전달하지 않으면 객체 생성 불가
		//CreditCard c2=new CreditCard2();
		
		//아래와 같이 개인정보를 전달해야만
		//신용카드 객체를 생성할 수 있다.
		CreditCard2 c2=new CreditCard2("박보검 개인정보");
		System.out.println(c2.getPersonalInfo());
		//이후 개인정보 수정되면 setter를 이용하면 된다. 
		c2.setPersonalInfo("변경된 박보검 개인정보");
		System.out.println(c2.getPersonalInfo());
	}
	
	
}
