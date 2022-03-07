package step7.model;

public class Customer {
	//public 접근제어자는 다른 패키지에서 접근 가능 
	public String password1="public";
	//protected 접근제어자는 같은 패키지에서만
	//접근가능( 상속시에는 다른 패키지에서 접근 가능 )
	protected String password2="protected";
	//default 접근제어자는 같은 패키지에서만 접근 가능 
	 String password3="default";
	 //private 접근제어자는 동일한 클래스내에서만 접근 가능
	private String password4="private";
	//위의 private 변수는 동일한 클래스에서만 아래와 같이
	//접근 가능하다 
	public String getPassword4() {
		return password4;
	}
}











