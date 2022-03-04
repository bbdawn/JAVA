package step5.solution;

public class CompanyService {
	public void printDetailInfo(Employee e) {
		// println 내부에서 toString()을 호출
		// toString() 오버라이딩된 자신의 메서드가 호출되므로
		// 자신이 가지고 있는 속성정보들이 반환되어 출력된다 
		System.out.println(e);
		System.out.println(e.toString());// 동일한 결과 
	}
}
