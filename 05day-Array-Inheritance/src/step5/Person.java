package step5;

public class Person extends Animal{ //Animal(super class)을 상속받는다
	public void study() {
		
		//상속받더라도 부모의 private member(변수,메서드)에는 직접 접근 불가
		//compile error
		//System.out.println(age+"세 사람이 공부하다");
		//부모의  getter,setter로 접근하면 해결 가능!
		System.out.println(getAge()+"세 사람이 공부하다");
	}
}
