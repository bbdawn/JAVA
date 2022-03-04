package step3;

import java.util.ArrayList;

/*
 * case3
 * 하나의 try 블럭에서 여러 종류의 Exception이 발생되는 경우의 예외 처리방안
 * 하나의 try 블럭에 대한 여러 개의 catch구문이 정의 가능하다
 * try{
 * }catch(AException e){
 * }catch(BException e){
 * }
 */

public class TestException3 {
	public static void main(String[] args) {
		
		String name="아이유";
		ArrayList<String> list=new ArrayList<String>();
		list.add("박보검");
		try {
		//Exception발생 즉시 해당 Exception타입의 catch 구문으로 실행의 흐름이 이동된다. 
		System.out.println(list.get(1)); //존재하지 않는 요소를 반환받으려고 한다 -> IndexOutOfBoundsException 발생함. 
		System.out.println(name.length()); //NullPointException발생되고 메세지 출력 후 즉시 종료됨. 
		}catch(NullPointerException e) {
			System.out.println("name이 null이므로 길이를 구할 수 없습니다 -> 대안 실행");
		}catch(IndexOutOfBoundsException e2) {
			System.out.println("리스트에 존재하지 않는 범위의 요소입니다 -> 대안 실행");
		}catch(Exception e) {//가장 상위 클래스인 Exception으로 다양한 예외를 처리할 수 있다
			System.out.println("예외처리 - 대안실행");
		}
		System.out.println("프로그램 정상 수행");
	}
}
