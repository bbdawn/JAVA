package step3;

public class TestOverloading {
	public static void main(String[] args) {
		//Method Overloading Test : 동일한 메서드(생성자)명으로 다양한 매개변수를 정의해서사용
		Person p=new Person();
		p.eat(); //eat() 먹다 출력됨
		p.eat("햄버거"); //햄버거 먹다
		p.eat(3); //3인분 먹다
		p.eat("김밥", 3); //김밥 3인분 먹다
	}
}
