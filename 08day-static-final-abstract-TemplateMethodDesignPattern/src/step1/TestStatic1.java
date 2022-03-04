package step1;

class Person{
	int money1; //instance variable, heap에 저장
	static int money2;// static variable, meta space에 저장
	public void test1() {
		System.out.println("Object의 method test1"); //객체 생성 후 호출 가능
	}
	public static void test2() {//객체 생성 없이 클래스명으로 호출가능
		System.out.println("Class의 method test2");
	}
}


public class TestStatic1 {
	public static void main(String[] args) {
		//다른 클래스에서 일반 instance variable에 접근할 경우에는 객체 생성이 필요!!
		Person p=new Person();
		System.out.println(p.money1);
		//다른 클래스에서 static member(variable)에 접근할 경우에는 별도의 객체 생성없이 클래스명으로 접근 가능!!
		System.out.println(Person.money2); //클래스명.static멤버
		//System.out.println(Person.money1); //static이 아니므로 error
		//method에 접근
		p.test1();// 객체 생성 후 호출 가능
		Person.test2();// 객체 생성 없이 클래스명으로 호출 가능
	}
}

