package step3;

public class KostaMember {
	private String id;
	private String password;
	//단축키 alt + shift + s 또는 마우스 오른쪽>source>Generate Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id; //this는 현재 객체를 가르킨다
		//매개변수 id와 instance 변수 id를 구분하기 위해 사용
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
