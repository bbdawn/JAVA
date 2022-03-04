package step6.access;

public class Bank {
	public void publicTest() {
		System.out.println("public method");
	}
	
	protected void protectedTest() {
		System.out.println("protected method");
	} //다른 패키지에서 접근할 때는 현 클래스Bank를 상속받았을 때만 사용 가능
	
	void defaultTest() {
		System.out.println("default method");
	}
	
	/*노란색 warning 메세지 때문에 주석처리
	private void privateTest() {
		System.out.println("private method");
	}
	*/

}
