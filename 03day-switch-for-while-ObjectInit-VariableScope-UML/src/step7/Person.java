package step7;

public class Person {
	private int money; //class 내에서 선언 -> instance variable 기본 초기화0

	public Person() {
		int i=1;//생성자 내에서 선언초기화되었으므로 local variable
		System.out.println(i);
	}
	

	public void test1() {
		int i;//method 내에 선언되었음 -> local variable
		System.out.println(money); //0 -> 기본초기화 0
		//System.out.println(i); //error : local variable은 반드시 명시적 초기화가 필요하기 때문. 
		i=0;//명시적 초기화를 해준다
		System.out.println(i); //i는 스택에 저장된다
	}
	
	public void test2(int money) { //매개 변수(parameter)이자 지역변수(local variable) -> stack에 저장
		System.out.println(money); //2 //local variable
		System.out.println(this.money);//0 //instance variable 
	}
	
	//test3메서드 : local variable은 선언 초기화된 실행영역에서만 사용 가능
	public void test3() {
		if(money<1) {//현재 instance variable money는 0
			int count=1; 
			System.out.println(count);//동일한 실행영역 내에서만 사용 가능
		}//if
		//System.out.println(count); //error : local variable은 선언초기화된 실행영역에서만 사용가능하기 때문. 
		//--> test4()와 같이 사용하면 된다
	}//method
	
	public void test4() {
		int count=0;
		if(money<1) {
			count=1;
		}
		System.out.println(count);
		
	}
	
	public void test5() {
		int j=1;
		System.out.println(j);
	}
	
	
	public void test6() {
		//System.out.println(j); //error: local variable j는 test5 메서드 실행이 완료되면 메모리에서 해제되기 때문
	}
	
	
}
