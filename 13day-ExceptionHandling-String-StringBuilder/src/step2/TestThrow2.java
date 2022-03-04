package step2;
//어제까지 했던 예외처리내용을 복습하는 예제임
/*
 * 실행결과예측하기
 * 1. 정상적인 데이터
 * 	정답: a->b->c->e
 * 
 * 2. 비정상적인 데이터
 * 	정답: b->d->e
 * 
 */
public class TestThrow2 {
	public static void main(String[] args) {
		ReviewService service=new ReviewService();
		int money=100; //정상적인 데이터
		money=0; //비정상적인 데이터
		try {
			service.deposit(money);
			System.out.println("c");
		} catch (ReviewException e) {
			System.out.println("d");
			System.out.println(e.getMessage());
		}
		System.out.println("e");
		
		
		
	}//main
}//class
