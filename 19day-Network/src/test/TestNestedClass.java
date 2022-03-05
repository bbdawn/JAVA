package test;
/*
 *  Nested Class 중첩 클래스 ( inner class ) : class 내부에 class를 정의 
 *  Outer class 와 Inner class 끼리는 private member에 접근 가능 
 *  Inner class는 Outer class의 객체 생성을 통해서만 자신이 객체생성 될 수 있다 
 */
public class TestNestedClass {
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.test();
		outer.accessTest();
	}
}
