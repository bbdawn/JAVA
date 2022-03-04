package step1;

public class TestInterface1 {
	public static void main(String[] args) {
		System.out.println(Flyer.ID);
		//Flyer.ID="spring"; //error: 상수이므로 재할당 안됨
		 //상위 인터페이스 타입으로 하위 객체를 참조
		Flyer f1=new Bird();
		f1.fly();
		Flyer f2=new Airplane();
		f2.fly();
		
		
	}

}
