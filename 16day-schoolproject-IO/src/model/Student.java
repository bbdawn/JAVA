package model;

public class Student extends Member {
	private String stdId;


	public Student(String tel, String name, String address, String stdId) {
		super(tel, name, address);
		this.stdId = stdId;
	}

	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	//toString()
	@Override
	public String toString() {
		return "Student ["+super.toString()+" stdId:" + stdId + "]";
	}
	
	
	
	
}
