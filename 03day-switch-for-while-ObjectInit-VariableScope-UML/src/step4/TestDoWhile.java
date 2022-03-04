package step4;

public class TestDoWhile {
	public static void main(String[] args) {
		//do while문은 반드시 do 구문이 실행된 후 조건 비교
		int i=1;
		do {
			System.out.println("do 구문 실행 후 조건심사" +i);
			i++;
		}while(i<0);
		
	}//main
}//class
