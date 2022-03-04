package step3;

//실행 결과 예상 : b c d
//9 line에서 예외발생되면 즉시 catch구문으로 제어가 이동되어 b,
//finally는 항상 실행하므로 c,
//정상 수행이므로 d 출력
public class TestException6 {
	public static void main(String[] args) {
		String money="이백";
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
