package step5;

public class CreditCard {
	private String personalInfo;
	//생성자를 명시하지 않았으므로 컴파일러가
	//기본 생성자를 자동 삽입
	public String getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(String personalInfo) {
		this.personalInfo = personalInfo;
	}
	
}
