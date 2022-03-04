package step7;

public class TestVariableScope {
	public static void main(String[] args) {
		Person p=new Person(); 
		//p는 local variable. 메서드 내에서 선언했으니까. 
		//p는 stack에 저장됨
		p.test1();
		p.test2(2);
	}
}
