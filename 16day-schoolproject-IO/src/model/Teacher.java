package model;

public class Teacher extends Member {
	private String subjext;

	public Teacher(String tel, String name, String address, String subjext) {
		super(tel, name, address);
		this.subjext = subjext;
	}

	public String getSubjext() {
		return subjext;
	}

	public void setSubjext(String subjext) {
		this.subjext = subjext;
	}

	@Override
	public String toString() {
		return "Teacher ["+super.toString()+" subjext:" + subjext + "]";
	}
	
	
}
