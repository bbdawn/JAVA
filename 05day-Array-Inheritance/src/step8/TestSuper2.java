package step8;
//super()의 역할
class Parent{//별도의 상속관계가 없으면 자동으로 extends Object 처리됨 ---> java.lang.Object : 자바의 최상위클래스!!  
		Parent(){// super()가 자동 삽입됨
			System.out.println("Parent 객체 생성");
		}
	
}

class Child extends Parent{
	Child(){//super(); //별도로 super()를 명시하지 않으면 컴파일 시에 삽입, super()실행문은 반드시 생성자 첫 라인에 위치.
					   //부모 생성자를 실행시켜 부모 객체를 생성하게 하는 역할을 함.
		super(); //이건 가능!!
		System.out.println("Child 객체 생성");
		//super(); //compile error : 생성자 실행 구문의 첫번째에 위치해야하기때문
		
		}
}



public class TestSuper2 {
	public static void main(String[] args) {
		new Child();
		
	}

}
