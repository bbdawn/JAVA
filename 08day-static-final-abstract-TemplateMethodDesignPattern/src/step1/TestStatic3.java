package step1;
//static과 non-static 접근 관련 테스트
class Car{
	int num1;
	static int num2;
	public static void test1() {
		//System.out.println(num1); //error: static method는 객체 생성없이 실행가능하므로 num1이 메모리에 존재한다는 보장없음
		System.out.println(num2); //가능: static끼리이므로 접근가능
		//test2(); //compile error  
	}
	
	public void test2(){
		System.out.println(num1);//가능: Object의 member 즉 non-static끼리 가능
		System.out.println(num2);//가능: test2()가 실행한다는 것은 객체 생성을 전제로 하고 객체 생성이 된다는 것은 클래스로딩을 전제로 하므로 
		test1(); //가능 : non-static에서 static으로 바로 접근 가능!
	}
}
public class TestStatic3 {

	
}
