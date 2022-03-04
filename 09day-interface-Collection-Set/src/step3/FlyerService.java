package step3;

import step1.Flyer;

//서비스를 제공하는 측 back
public class FlyerService {
	public void proceed(Flyer f) {//상위 인터페이스 타입으로 다양한 객체를 받을 수 있다
		f.fly();//구체적인 객체의 내용을 몰라도 인터페이스의 추상메서드 호출로 실행가능
	}
}
