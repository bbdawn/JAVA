package step2;

public class ReviewService {
	public void deposit(int money) throws ReviewException {
		try {
			if(money<=0) {
				throw new ReviewException(money+" 잘못된 입금액");
			}
			System.out.println("a");
		}finally {
			System.out.println("b");
		}//finally
	}//deposit method
}//class
