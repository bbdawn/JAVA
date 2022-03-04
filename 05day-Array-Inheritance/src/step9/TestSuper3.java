package step9;
/*
 * 상속 관계가 있을 경우 객체 생성 순서 확인
 * new C();로 객체를 생성하면 Object-> A-> B-> C 순으로 생성된다. (C객체는 Object, A, B, C 모두를 가지고 있음!)
 */
class A{//super(); -> Object 생성자 호출 
	A(){//super(); --> Object(모든 클래스의 최상위클래스) 생성자 호출 
		System.out.println("A 객체 생성");
	}
}
class B extends A{
	B(){//super(); --> A 생성자 호출
		System.out.println("B 객체 생성");
	}
}

class C extends B{
	C(){//super(); --> B 생성자 호출
		System.out.println("C 객체 생성");
	}
}

public class TestSuper3 {
	public static void main(String[] args) {
		new C();
	}

}
