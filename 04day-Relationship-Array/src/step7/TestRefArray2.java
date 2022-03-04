package step7;

//import : ctrl+shift+o
import step6.Person;

public class TestRefArray2 {
	public static void main(String[] args) {
		//배열 선언 생성 할당을 동시에 
		Person [] pa= {
				new Person("강하늘",34),
				new Person("박보검",28),
				new Person("유재석",50)
		};
		int age=30; // 30 을 초과하는 Person의 name과 age를 출력 
		// for 과 if 문을 이용 
		for(int i=0;i<pa.length;i++) {
			if(pa[i].getAge()>age) {
				System.out.println(pa[i].getName()+" "+pa[i].getAge());
			}//if
		}//for
	}//main
}//class




