package step3;

import step1.Airplane;
import step1.Bird;
import step2.SuperMan;

//사용자측 front
public class TestInterface3 {
	public static void main(String[] args) {
		FlyerService service=new FlyerService();
		service.proceed(new Bird());
		service.proceed(new Airplane());
		service.proceed(new SuperMan());
	}
}
