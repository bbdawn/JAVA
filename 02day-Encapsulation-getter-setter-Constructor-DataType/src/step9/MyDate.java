package step9;

public class MyDate {
	private int month=-1;
	public MyDate(int month) {
		//1월 이상 12월 이하일때에만 할당하도록 조건문을 명시
		if(month>=1&&month<=12) {
		this.month=month;
	}else {
		System.out.println(month+"월은 잘못된 월 정보입니다");
		}
	}
	public int getMonth() {
		return month;
	}
}
