package step5;

public class TestMethod1 {
	public static void main(String[] args) {
		//객체 생성 
		Student s=new Student();
		s.study();//calling method 메서드 호출 
		//아래 메서드를 호출하기 위해서는 
		//Worker 메서드에서 요구하는 파라미터(매개변수)
		//에 알맞는 정보를 전달해야 호출 가능하다 
		s.study2("java");
		//Student의 study3 메서드를 호출하고 
		//반환 정보를 받아서 출력 
		String data=s.study3("spring");
		System.out.println("main:"+data);
	}
}











