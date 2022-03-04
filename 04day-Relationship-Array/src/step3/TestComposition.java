package step3;
//Car가 Engine을 소유한 관계. 
//TestComposition + Car + Engine
public class TestComposition {
	public static void main(String[] args) {
		//composition, consist of
		Car c=new Car("K5");//Car 객체 생성하면 Engine 객체도 함께 생성된다. 
		System.out.println(c.getModel());
		
		//c가 참조하는 Car 객체의 엔진 type을 반환받아 출력
		System.out.println(c.getEngine().getType());
		
		//c가 참조하는 Car 객체의 엔진 배기량을 3000으로 변경
		c.getEngine().setDisplacement(3000);
		
		//변경된 엔진 배기량을 출력
		System.out.println(c.getEngine().getDisplacement());
		
		
		
	}
}
