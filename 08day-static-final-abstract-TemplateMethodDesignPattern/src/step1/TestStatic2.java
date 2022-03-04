package step1;
//static과 non-static(object or instance member)과의 접근 여부에 대한 예제
public class TestStatic2 {
	private int age;//instance variable, object의 member -> 객체 생성할 때 heap에 메모리가 적재 
	private static int age2;//static(or class) variable, class의 member -> 클래스 로딩시에 meta space에 메모리가 적재
	public void test1() {//object의 member method
		System.out.println("object의 method test1");
		System.out.println(age);//non-static끼리 접근 가능
		System.out.println(age2);//non-static test1()에서 static age2로 접근가능
	}
	
	public static void test2() {
		System.out.println("class의 method test2");
		//System.out.println(age);	//error: static method인 test2는 객체 생성 없이  바로 실행가능한 메서드. 즉 객체 생성이 보장되어있지 않다
									//age instance variable은 객체 생성할 때에 메모리에 적재되므로 접근하기 위해서는 객체 생성이 필요하다
		System.out.println(age2);
	}
	
	public static void main(String[] args) {//main method는 static method이다
		//error: heap 메모리에 존재하는 상태가 아니기 때문 
		//동일한 클래스 내부에서라도 static 영역에서 
		//non-static(instance variable or method)영역으로 직접 접근은 불가능
		//System.out.println(age);
		//instance variable인 age에 접근하기 위해서는 동일한 클래스 내에서라도 반드시 객체 생성이 필요함.
		
		TestStatic2 t=new TestStatic2();
		System.out.println(t.age);
		//test1(); //static에서 non-static인 test1에 직접접근 불가
					//객체 생성 후 참조변수를 통해 접근 가능
		t.test1();
	}
	

}
