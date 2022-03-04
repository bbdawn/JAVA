package step1;

public class TestEncapsulation {

	public static void main(String[] args) {
		// Encapsulation 적용 코드 테스트
		MyDate date=new MyDate();
		//잘못된 day를 할당(32일은 없음!)
		date.day=32;
		System.out.println(date.day);
		//아래는 private이므로 접근 불가
		//값을 할당할 수없다
		//date.encapsulDay=32;
		date.setEncapsulDay(32);
		System.out.println(date.getEncapsulDay());
		date.setEncapsulDay(31);
		System.out.println(date.getEncapsulDay());
		
		
		
		
		
		
		
		
	}

}












