package step4;

class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}

class Rabbit extends Animal{
	//메서드 오버라이딩 : 부모 메서드를 자신에 맞게 구현부를 재정의
	//오버라이딩 규칙 : 접근제어자는 부모가 선언한 것에서 범위가 좁아지면 안 됨. (넓어지는 건 상관없음)
	//					리턴타입, 매개변수, 메서드명은 일치해야한다.
	public void eat() {
		System.out.println("토끼가 채식하다");
		//만약 부모의 eat()을 호출하고 싶다면 super를 이용하면 된다
		//super.eat();
	}
}
public class TestOverriding {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat(); //먹다
		Rabbit r=new Rabbit();
		r.eat();//토끼가 채식하다 //오버라이딩된 메서드가 호출되게됨.
		
	}

}
