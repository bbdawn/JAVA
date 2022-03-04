package step4;
/*
 *  다형성 적용 매개변수 
 *  instanceof 연산자 활용 
 *  Object Casting 활용 
 */
public class TestPolymorphism5 {
	public static void main(String[] args) {
		ZooService3 service=new ZooService3();
		service.enter(new Tiger());
		service.enter(new Monkey());
		service.enter(new Person());
		/*
		 	호랑이가 사냥하며 놀다 
		 	원숭이가 나무타며 놀다 
		 	사람이 티켓을 구매하다
		 	사람이 데이트하며 놀다 
		 */
	}
}
