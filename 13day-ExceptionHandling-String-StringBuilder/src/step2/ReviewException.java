package step2;
//
public class ReviewException extends Exception {

	private static final long serialVersionUID = 797627083610926317L;
	public ReviewException(String message) {
		//부모 Exception class의 생성자를 호출, 이 때 예외 메세지를 할당하고 
		//catch구문에서는 Exception class의 getMessage()를 이용해 예외 메세지를 반환받을 수 있다
		super(message);
		
	}
}
