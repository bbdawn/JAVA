package step2;

public class TestPerson {
	//JVM이 실행 시작시점의 진입점이 main
	public static void main(String[] args) {
		System.out.println("main 시작");
		//Person class를 이용해 Person 객체를 생성
		Person p=new Person();
		//객체에 저장된 name 변수의 값을 받아와 출력 
		System.out.println(p.name);
		//객체의 메서드를 호출
		p.eat();
		System.out.println("main 종료");
	}
}



