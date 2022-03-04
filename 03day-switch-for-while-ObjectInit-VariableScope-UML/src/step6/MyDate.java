package step6;

public class MyDate {
	private int day1;
	private int day2=22;
	private int day3=31;
	private boolean flag;//기본초기화 false
	private String name;//기본초기화 null, 참조형은 모두 null로 초기화
	
	public MyDate(int day3) {
		this.day3=day3;
	}
	
	
	public boolean isFlag() { //is!!!
		return flag;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDay1() {
		return day1;
	}
	
	//shift+alt+s -> generate getterandsetter
	public void setDay1(int day1) {
		this.day1 = day1;
	}
	public int getDay2() {
		return day2;
	}
	public void setDay2(int day2) {
		this.day2 = day2;
	}
	public int getDay3() {
		return day3;
	}
	public void setDay3(int day3) {
		this.day3 = day3;
	}
	
	

}
