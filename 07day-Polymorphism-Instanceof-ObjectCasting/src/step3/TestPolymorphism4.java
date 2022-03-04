package step3;
// Polymorphism 적용시 특징 , Object Casting 사례 
class Animal{
	public void sleep() {
		System.out.println("자다");
	}
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	//메서드 오버라이딩 
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
	//자신의 독자적인 메서드 정의 
	public void study() {
		System.out.println("사람이 공부하다");
	}
}
public class TestPolymorphism4 {
	public static void main(String[] args) {
		Animal a=new Person(); // 부모 타입의 변수로 자식 객체를 참조해본다 
		a.sleep();//상속받았으므로 실행가능 
		a.eat();//오버라이드 된 자신의 메서드가 실행 
		((Person) a).study();//자식의 독자적 멤버(메서드,변수)에 접근하기 위해서는
		// Object Casting이 필요 
	}
}







