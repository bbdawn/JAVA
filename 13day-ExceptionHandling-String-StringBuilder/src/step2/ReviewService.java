package step2;

public class ReviewService {
	public void deposit(int money) throws ReviewException {
		try {
			if(money<=0) {
				throw new ReviewException(money+" �߸��� �Աݾ�");
			}
			System.out.println("a");
		}finally {
			System.out.println("b");
		}//finally
	}//deposit method
}//class
