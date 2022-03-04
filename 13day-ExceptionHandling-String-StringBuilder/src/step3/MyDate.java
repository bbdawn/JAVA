package step3;

public class MyDate {
	private int day;

	public MyDate(int day) throws DayException {
		if(day<1||day>31) {
			throw new DayException(day+" 일은 잘못된 입력값입니다(1~31 사이만 가능)");
		}
		this.day = day;
	}

	public int getDay() {
		return day;
	}
	
	
	
	
}
