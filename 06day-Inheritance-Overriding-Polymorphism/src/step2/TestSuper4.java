package step2;
// super() 구문을 직접 명시해야 하는 경우에 관한 예제 
//부모 클래스 
class Animal{
	int age;
	//부모 클래스에서 매개변수가 있는 생성자를 명시해본다 
	Animal(int age){
		this.age=age;
	}
	//Animal(){}// 해결방안 1) 부모 클래스의 생성자 오버로딩을 하면 자식의 기본 생성자에서도 객체 생성을 할 수 있다 
}
class Person extends Animal{
	//생성자를 명시하지 않으면 아래와 같이 기본 생성자가 컴파일시에 삽입된다 
	//아래의 super()는 매개변수가 없는 부모의 기본 생성자를 호출하는 데 부모는 매개변수가 있는 생성자만 
	//있으므로 compile error 
	//Person(){super(); } 
	// 해결방안 2) 자식 클래스에서 생성자를 정의하고 부모 생성자의 매개변수에 알맞는 인자를 전달하는 super(age)를 명시
	//				 이 방식이 권장사항임 
	Person(int age){
		super(age);// 부모의 생성자 매개변수에서 필요로 하는 인자를 전달 
	}
}
public class TestSuper4 {
	public static void main(String[] args) {
		Person p=new Person(22);
		System.out.println(p.age);
	}
}















