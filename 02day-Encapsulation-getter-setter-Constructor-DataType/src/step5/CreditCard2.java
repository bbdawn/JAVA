package step5;

public class CreditCard2 {
	private String personalInfo;
	//생성자 Constructor 
	public CreditCard2(String personalInfo) { //개인정보를 입력해야만 카드를 입력할 수 있음! 
		this.personalInfo=personalInfo;
	}
	public String getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(String personalInfo) {
		this.personalInfo = personalInfo;
	}
	
}
