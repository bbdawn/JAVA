package step1;
// 한 눈에 코드를 확인하기 위해 하나의 파일에서 여러 클래스를 정의 
class GrandParent{// extends Object : 별도의 상속관계가 없으면 자동으로 extends Object 처리됨 
	GrandParent(){
		//별도의 super() 를 명시하지 않으면 super()가 자동삽입 --> java.lang.Object 생성자호출 
		System.out.println("GrandParent 객체 생성");
	}
}
class Parent extends GrandParent{
	Parent(){ 
		super();
		System.out.println("Parent 객체 생성");
	}
}
class Child extends Parent{
	 Child(){ super(); 
	 	System.out.println("Child 객체 생성");
	 } 
}
public class TestInheritanceReview {
	public static void main(String[] args) {
		new Child();
	}
}
