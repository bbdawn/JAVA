package step6.test;

//import : ctrl+shift+o
import step6.access.Bank;

public class KostaBank extends Bank{
	public void accessTest() {
		
		publicTest();
		// 상속받았으므로 부모의 메서드 사용가능
		
		protectedTest();
		//protected는 같은 패키지에서만 접근 가능하지만
		//상속받았으므로 다른 패키지에서도 접근 가능
		
		//defaultTest(); //default는 다른 패키지에서 접근 불가
		//privateTest(); //private은 자신의 클래스 내에서 사용 가능
	}
}

