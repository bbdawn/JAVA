package step5;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e=new Employee("1","아이유",300);
		System.out.println(e.getDetails());
		//위 코드를 실행하면 아래와 같이 출력된다
		//empNo:1 name:아이유 salary:300
		//return 사용했음!!
		
		Manager m=new Manager("2","박보검",400,"연구개발");
		System.out.println(m.getDetails());//오버라이딩된 메서드 호출하기
		//empNo:2 name:박보검 salary:400 department:연구개발
		//empNo~salary까지는 super.get~ 사용하기! 
		
		Engineer en=new Engineer("3", "강하늘", 500, "자바");
		System.out.println(en.getDetails());
		//empNo.3 name:강하늘 salary:500 skill:자바
		
	}
}
