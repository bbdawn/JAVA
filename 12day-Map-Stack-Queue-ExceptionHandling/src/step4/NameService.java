package step4;

public class NameService {

	/*
	 * 매개변수 name으로 null 전달되어 concat()이 실행되는 시점에 
	 * RuntimeException의 자식 Exception인 NullPointerException이 발생
	 * RuntimeException계열은 별도의 throws 필요 없이 호출한 측으로 
	 * 그 예외가 전파되는 특징이 있다. 
	 */
	public void printMessage(String name) {
		String info=name.concat(" 가수");//concat() 특정 문자열을 덧붙임
		System.out.println(info);
	}

}
