package step6;

public class TestMethod2 {
	public static void main(String[] args) {
		//Friend 객체 생성 ( 변수는 f ) 
		Friend f=new Friend();
		// eat() 메서드를 호출해본다 
		f.eat();
		//아래 호출부에 대응하는 메서드를 구현
		f.eat2("피자");//피자 먹다 
		f.eat3("김밥",3);//김밥 3인분 먹다 
		String returnValue=f.eat4();
		System.out.println(returnValue);//치맥
		
	}
}
