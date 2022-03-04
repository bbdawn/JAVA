package step1;

public class Airplane implements Flyer {

	@Override
	public void fly() {
		//상위인터페이스의 추상메서드를 반드시 구현해야한다
		//구현하지 않으면 자신이 abstract class로 선언되어야하고
		//이 경우 new Airplane()으로 생성되는 것은 불가하다.
		System.out.println("비행기가 날다");
		
	}

}
