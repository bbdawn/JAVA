package step7;
//jdk1.8이상에서 지원하는 interface의 default method와 static method test

interface OpenSourceInterface{//interface는 구현된 메서드를 정의할 수 없으나 유지보수성 차원에서 default method는 허용
	public void a();
	public default void b() {
		System.out.println("default method");
	}
	public static void c() {//interface는 Object member인 구현된 메서드는 정의할 수 없으나 static method는 허용
		System.out.println("interface static method");
	}
	
}

class KbBank implements OpenSourceInterface{
	public void a() {}
}

class KaKaoBank implements OpenSourceInterface{
	public void a() {}
	//필요시 자신에 맞게 default method를 오버라이딩 할 수 있다
	public void b() {
		System.out.println("default method online only");
	}
}


public class TestInterface7 {
	public static void main(String[] args) {
		OpenSourceInterface os=new KbBank();
		os.b();
		
		//static method는 Interface명.static method로 접근 -> 객체 차원의 기능이 아니다
		OpenSourceInterface.c();
		OpenSourceInterface os2=new KaKaoBank();
		os2.b();
	}
	

}
