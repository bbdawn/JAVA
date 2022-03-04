package step2;

import step1.Flyer;

//하나의 클래스에서 다양한 인터페이스를 구현할 수 있다
public class SuperMan implements Flyer,Fighter{

	@Override
	public void fight() {
		System.out.println("슈퍼맨이 악당과 싸우다");
		
	}

	@Override
	public void fly() {
		System.out.println("슈퍼맨이 날다");
		
	}

}
