package test;
/*
 *  Nested Class ��ø Ŭ���� ( inner class ) : class ���ο� class�� ���� 
 *  Outer class �� Inner class ������ private member�� ���� ���� 
 *  Inner class�� Outer class�� ��ü ������ ���ؼ��� �ڽ��� ��ü���� �� �� �ִ� 
 */
public class TestNestedClass {
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.test();
		outer.accessTest();
	}
}
