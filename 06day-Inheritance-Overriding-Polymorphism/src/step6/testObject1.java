package step6;

import step3.Employee;

//Car의 부모는 Object 이다
class Car{//extends Object --> 별도의 상속관계가 없으므로 자동삽입
	//Car(){super();} --> 생성자를 명시하지 않았으므로 자동 삽입
}
public class testObject1 {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.getClass()); //Object class로부터 상속받은 메서드, 이 객체는 어떤 클래스로 만들어졌느냐의 정보를 반환
		Employee e=new Employee("1","유재석",300);
		System.out.println(e.getClass()); //Object class로부터 상속받은 메서드를 실행
		//Object class의 toString()를 호출해서 해당 객체의 주소값을 반환받아 출력
		System.out.println(c.toString());
		System.out.println(c);//println 메서드 내부에서 toString() 호출해 리턴한 값을 출력하므로 동일한 결과.
		System.out.println(e.toString());
		System.out.println(e);
	}

}
