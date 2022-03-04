package step3;
//abstract class의 특징을 확인하는 예제
//abstract class는 new로 객체생성할 수 없다
//abstract class는 상속받은 자식 class가 객체생성할 때 부모로서 객체생성은 가능하다
//즉 abstract class는 부모클래스로서의 역할에 집중한다

abstract class Person{
	int age=1;
	Person(){
		System.out.println("Person 객체 생성");
	}
	public void eat() {
		System.out.println("먹다");
	}

}

class Student extends Person{
	Student(){ super(); //Person 생성자 실행해서 Person 객체를 생성
		System.out.println("Student 객체 생성");
	}
}
public class TestAbstract1 {
	public static void main(String[] args) {
		//Person p=new Person(); //error: abstract class는 직접객체화될 수 없다 (new로 생성불가)
		Student s=new Student();
		s.eat();
		System.out.println(s.age);
		//당연히 부모타입으로 자식객체를 참조할 수 있따
	}

}
