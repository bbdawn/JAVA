package step5;
/*
 * Exception class를 정의. java.lang.Exception을 상속받아서 만들면 됨
 */
public class AgeException extends Exception{
	//java io 객체 직렬화에서 공부할 예정
	private static final long serialVersionUID = -4407398834061700388L;
	public AgeException(String message) {
		super(message); //부모인 Exception class의 생성자를 호출해 예외메세지를 할당
	}
}
