package step4;
//abstract method 특징 이해

abstract class Parent{
	public void eat() {
		System.out.println("밥");
	}
	//공부는 대신 해줄 수 없고 스스로 해야하므로 abstract method로 선언한다
	//abstract method를 선언하면 해당 클래스는 abstract class로 선언되어야한다
	//abstract method는 구현부가 없다
	//자식클래스는 반드시 abstract method를 구현하거나 자신도 abstract class로 선언되어야한다. 
	//자식클래스에게 기능구현을 강제하는 효과가 있음!!!!!
	public abstract void study();

}

//방법1. 공부하기
class Child extends Parent{
	public void study() {//부모의 abstract method를 구현
		System.out.println("공부하다");
	}
}

//방법2. 공부 안하고 객체화 못함
abstract class Child2 extends Parent{//abstract class이므로 new로 생성 불가. 직접 객체화될 수 없다. 
}
public class TestAbstract2 {
	public static void main(String[] args) {
		Parent p=new Child();
		p.eat();
		p.study();
		//Parent p2=new Child(); // abstract class이므로 객체생성불가
	}

}
