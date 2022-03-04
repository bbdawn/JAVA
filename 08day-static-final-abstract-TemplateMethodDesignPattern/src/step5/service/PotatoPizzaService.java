package step5.service;

//ctrl+shift+o
import step5.common.PizzaService;

public class PotatoPizzaService extends PizzaService{
	//부모의 abstract method를 구현한다.
	//만약 구현하지 않으면 자신 또한 abstract class로 선언되어야한다 
	//                      		-> abstract class로 선언되면 객체생성불가
	@Override //Annotation 어노테이션 -> 컴파일과 실행시 영향을 주는 의미있는 주석
	//@Override Annotation : 컴파일시에 오버라이드 문법을 체크하는 역할을 함. 
	public void topping() {
		System.out.println("감자토핑");
		
	}

}
