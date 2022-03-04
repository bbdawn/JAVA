package step2;

import step1.Airplane;
import step1.Bird;
import step1.Flyer;

public class TestInterface2 {
	public static void main(String[] args) {
		//SuperMan class로부터 생성된 객체는 다양한 계층구조로 형성되어있으므로 다형성을 다양하게 지원할 수 있다 (여러타입으로 참조될 수 있다)
		Flyer f1=new SuperMan();
		f1.fly();
		Fighter f2=new SuperMan();
		f2.fight();
		/////////////////////////////////////////////////////////
		//상위 인터페이스 타입의 하위 객체들을 요소로 추가할 수 있다
		Flyer[] fa= {new Airplane(),new Bird(),new SuperMan()};
		for (int i=0; i<fa.length;i++) {
			//Abstract의 목적
			//사용하는 측은 어떤 구체적인 객체(구현체)인지 몰라도 인터페이스의 추상메서드(사용법)만 알면 
			//모든 다양한 객체들을  각자의 방식으로 동작하게 할 수 있다!!!
			fa[i].fly();
		}
	}
}
