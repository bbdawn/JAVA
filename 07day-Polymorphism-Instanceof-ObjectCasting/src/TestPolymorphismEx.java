
import step5.solution.*;
public class TestPolymorphismEx {
	public static void main(String[] args) {
		int length=10;
		// service의 인스턴스 변수로 선언된 10개 길이를 가진 배열이 생성해서 할당한다 
		HumanResourceService service=new HumanResourceService(length);
		service.add(new Manager("1","아이유",600,"기술영업부"));
		service.add(new Employee("2","강하늘",400));
		service.add(new Engineer("3","박보검",700,"자바"));
		service.printAll();
		/*
		 	empNo:1   name:아이유   salary:600  department:기술영업부 
		 	empNo:2   name:강하늘   salary:400 
		 	empNo:3   name:박보검   salary:700  skill:자바  
		 */
	}
}
