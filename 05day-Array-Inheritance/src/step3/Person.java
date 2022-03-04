package step3;

public class Person {
	public void eat() {
		System.out.println("먹다");
	}
	
	public void eat(String menu) {//Overloading
		System.out.println(menu+"먹다");
	}
	
	public void eat(int count) {//Overloading
		System.out.println(count+"인분");
	}
	
	public void eat(String menu,int count) {//Overloading
		System.out.println(menu+" "+count+"인분 먹다");
	}
	
	public void eat(int count, String menu) {//Overloading 매개변수 순서 및 타입이 다르므로 ok
		System.out.println(menu+" "+count+"인분 먹다");
	}
	
	
	//ctrl+shift+/ 영역 주석 처리, ctrl+shift+\ 영역주석해제
	//ctrl+shift+f : 코드 정리
	//ctrl+shift+o : import
	
	//아래 compile error : 변수명만 다를 뿐 매개변수의 타입, 순서, 개수가 일치하여
	//동일한 메서드로 인식되어 오버로딩 안됨. 
	/*
	 * public void eat(int c, String m) {//Overloading
	 * System.out.println(menu+" "+count+"인분 먹다"); }
	 */
	
	
	
}
