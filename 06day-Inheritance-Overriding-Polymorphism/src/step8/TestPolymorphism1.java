package step8;
class Animal{//extends Object
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
}




public class TestPolymorphism1 {

	public static void main(String[] args) {
	Animal a=new Animal(); //일반적으로 Animal 타입의 a변수에 Animal 객체를 참조시킨다
	a.eat();
	a.sleep();
	
	//다형성이 지원되므로 아래와 같은 코드가 가능하다!
	Animal a2=new Person(); //다형성 적용 예 -> 부모타입 변수로 자식 객체를 참조시킬 수 있는 성질
	a2.eat();//부모로부터 상속받은 메서드
	a2.sleep();//오버라이드 된 자신의 메서드가 실행
	//위의 부모타입의 변수로 자식 객체를 참조할 수 있다는 것(담을 수 있는 것)은 어떤 장점을 가질까?
	//-> [step9]
	}

}
