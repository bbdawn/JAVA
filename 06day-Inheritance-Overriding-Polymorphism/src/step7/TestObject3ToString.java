package step7;
//java.lang.Object(모든 클래스의 최상위 클래스)의 toString()을 오버라이드해서
//객체의 조서값 대신 실제 속성정보를 반환하도록 하는 연습예제

 


public class TestObject3ToString {
	public static void main(String[] args) {
		Employee e=new Employee("1", "아이유", 400);
		System.out.println(e); //empNo:1 name:아이유 salary:400
		Manager m=new Manager("2","강하늘",500, "기술영업");
		System.out.println(m);//empNo:2 name:강하늘 salary:500 department:기술영업
	}
}
