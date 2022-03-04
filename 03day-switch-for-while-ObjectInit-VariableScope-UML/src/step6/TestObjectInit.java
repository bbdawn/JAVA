package step6;

public class TestObjectInit {
	public static void main(String[] args) {
		MyDate date=new MyDate(29); //생성자에 의한 초기화
		//date 객체의 day1? day2? day3?
		//초기화 default->0(정수형), false(논리형), null(참조형)
		System.out.println(date.getDay1()); // 0 -> 기본초기화
		System.out.println(date.getDay2()); //0>22 -> 명시적 초기화 22
		System.out.println(date.getDay3()); //0>31>29 -> 명시적 초기화 31 했다가
											//		생성자에 의한 초기화 29로 됨. 
		System.out.println(date.isFlag()); //논리형 기본 초기화 false
		System.out.println(date.getName());//참조형 기본 초기화 null
		
		
	}
}
