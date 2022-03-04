package step4;
//편의상 코드를 한 눈에 보기 위해 하나의 파일에 여러 클래스를 작성
class Animal{//부모클래스
	int age;
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{//Animal을 상속받는다. Animal을 확장해서 Person을 만든다
	public void study() {
		System.out.println("공부하다");
	}
}


public class TestInheretance1 {
	public static void main(String[] args) {
		//자식 객체를 생성. Person은 Animal을 상속받았으므로 아래와같이 Animal 부모의 eat(), age를 사용할 수 있다
		Person p=new Person();
		p.study();
		p.eat(); //상속받았으므로 사용가능
		System.out.println(p.age);//상속받았으므로 접근 가능 
		
	}
}
