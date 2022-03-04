package step2;

class Product{
	//final 명시되면 상수가 됨(재할당 불가), 상수는 대문자로 구성, 합성어는 _ underscore로 연결
	final String ADMIN_ID="javaking";
	public void test() {
		//ADMIN_ID='aaa'; //error: 상수이므로 재할당 불가
	}
	//final method를 테스트
	public final void test2() {
		
	}

}

class MyProduct extends Product{
	//public void test2() {} //error: 부모의 test2()메서드는 final method이므로 오버라이딩 불가(재정의불가)
}

//final class 테스트
final class Test{}
//class SubTest extends Test{} //error: final class는 상속받을 수 없다



public class TestFinal {

}
