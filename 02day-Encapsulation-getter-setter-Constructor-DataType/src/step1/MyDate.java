package step1;

public class MyDate {
	//default 접근제어자이므로 외부 클래스에서 접근 가능
	// 잘못된 day value를 할당 할수도 있다
	int day;
	//private 접근 제어자를 명시해서
	//외부에서 접근하는 것을 차단한다 
	private int encapsulDay;
	//encapsulDay 인스턴스 변수에 대한 setter getter method를
	//정의해서 외부에서는 setter getter를 이용해
	//encapsulDay 변수에 간접 접근하도록 한다
	//setter method
	public void setEncapsulDay(int d) {
		if(d>=1&&d<=31) { // 조건 : 1이상 31이하이면
			encapsulDay=d;
		}else {//1이상 31이하가 아니면
			System.out.println("잘못된 입력값이므로 1일로 할당합니다");
			encapsulDay=1;//초기값설정
			
		}
	}
	
	public int getEncapsulDay() {
		return encapsulDay;
	}
	
}
