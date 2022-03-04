package step5;
/*
 * 상속 즉 Animal 부모의 멤버(변수,메서드)를 물려받더라도
 * 자식 Person에서는 부모의 private member에 직접 접근할 수 없고
 * 필요시 getter setter를 접해서 접근하면 된다. 
 */
public class TestInheritance2 {
	public static void main(String[] args) {
		Person p=new Person();
		p.study();
		p.eat(); //상속받았으므로 상속 가능
		
		
	
		//상속받았더라도 클래스가 다르면
		//private member(변수,메서드)에는 접근 불가
		//compile error
		//System.out.println(p.age);
		//부모의 setter getter로 접근하면 됨
		p.setAge(11);
		System.out.println(p.getAge());
		
		
	}//main
}//class
