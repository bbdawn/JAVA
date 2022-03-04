package step3;

import java.util.ArrayList;

//실행 결과 예상해보는 예제 : c
//아래 list.get(2)에서 IndexOutOfBoundsException이 발생되므로 a는 출력되지 않고 catch로 이동하려 하는데
//예외를 처리할 적절한 타입의 catch구문이 없으므로 예외처리에 실패하여 실행 종료하게 되는데 
//finally구문은 항상 실행되므로 c가 출력되고 
//!!!!!!!비정상종료이므로 d는 출력되지 않는다!!!!!!!

public class TestException8 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("장범준");
		list.add("아이유");
		try {
		list.get(2);
		System.out.println("a");
		}catch(NullPointerException e) {
			System.out.println("b");
		}finally {
			System.out.println("c");
		}
		System.out.println("d");
		
		
		
		
	}//main
}//class
