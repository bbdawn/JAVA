package step5;
//한 눈에 문법을 확인하기 위해 하나의 파일에서 작성
//자바는 단일 상속이다
class A{}
class B{}
//class C extends A,B{} //error: 자바는 단일상속이므로 여러 클래스를 상속받을 수 없다.

interface Ex1{
	public void ex1();
}
interface Ex2{
	public void ex2();
}

class ExImpl extends A implements Ex1, Ex2{ //인터페이스는 여러개 implements 할 수 있다 -> A, Ex1, Ex2와 같은 다양한 계층구조에 편입 가능!
	public void ex1() {}
	public void ex2() {}
}





//인터페이스끼리는 다중상속이 가능하다 (abstract method를 상속받는다는 의미)
interface D{
	public void d();
}
interface E{
	public void e();
}
interface Test extends D,E{//class는 다중상속이 안되지만 interface끼리는 가능하다
	public void t();
}
class TestImpl implements Test{ //Test interface는 상속받은 abstract method 포함 총 3개의 abstract method가 있음
	public void d() {}
	public void e() {}
	public void t() {}
}






//ExImpl class를 상속받는다
class SubExImpl extends ExImpl{}
public class TestInterface5 {
	public static void main(String[] args) {
	/*
	A a=new ExImpl();//가능
	Ex1 ex1=new ExImpl();//가능
	Ex2 ex2=new ExImpl();//가능
	Ex1 s1=new SubExImpl();//부모가 implements 하였으므로 가능	
	Ex2 s2=new SubExImpl();//부모가 implements 하였으므로 가능	 
	*/
	}
}
