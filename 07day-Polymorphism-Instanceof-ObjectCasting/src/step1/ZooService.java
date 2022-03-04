package step1;

//Service : 업무 business logic 
public class ZooService {
	/*
	 * Person , Dog , Monkey 와 같은 다양한 객체를 
	 * 하나의 메서드 매개변수로 처리할 수 있다 -> 다형성 지원의 장점
	 */
	//상속과 다형성을 적용한 예  
	public void pass(Animal a) { //객체의 오버라이드 된 메서드가 실행
		a.eat(); 
	}
	 
	// 아래는  상속과 다형성을 적용하지 않고 개발한 예 
	/*
	 public void pass(Person p) {
		 p.eat();
	 }
	 public void pass(Monkey m) {
		 m.eat();
	 }
	 public void pass(Dog d) {
		 d.eat();
	 }
	 // 새 구성원이 추가될 때마다 코드가 변경되어야 한다 TT
	 // 결합도가 높다 -> 유지보수성이 낮다 
	 public void pass(Tiger t) {
		 t.eat();
	 }
	 */
}
