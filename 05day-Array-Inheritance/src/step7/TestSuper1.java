package step7;
//편의상 하나의 파일에서 여러 클래스를 정의 (실제 개발시에는 파일별로 클래스를 만드는 것을 권장)
//super.멤버(변수or메서드)로 부모 클래스의 멤버에 접근해보는 예제

class Parent{
	String name="부모 이름";
}

class Child extends Parent{
	String name="자식 이름";
	public void printInfo() {
		System.out.println(name); //자식이름 //현재 자식 객체의 name
		System.out.println(super.name);//부모이름 //super를 이용해 부모의 name에 접근해 출력
	}
}

public class TestSuper1 {
	public static void main(String[] args) {
		//자식 객체 생성 후 테스트
		Child c=new Child();
		c.printInfo();
	}

}
