package step3;

//실행 결과 예상 : a c d
//숫자 포맷의 데이터가 할당되었으므로 예외 발생 없이 정상 수행됨. try 블럭 모두 실행 -> a
//예외 발생 안되었으므로 catch구문은 실행x bx,
//finally는 항상 실행하므로 c,
//정상 수행이므로 d 출력
public class TestException5 {
	public static void main(String[] args) {
		String money="200";
		try {
			int num=Integer.parseInt(money);
			System.out.println("a");
		}catch (NumberFormatException e) {
			System.out.println("b");
		}finally {
			System.out.println("c");
		}
		System.out.println("d");
	}
}
