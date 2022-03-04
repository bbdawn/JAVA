
import step5.solution.*;

public class HumanResourceService {
	private Employee[] array;
	private int count; // 현재 사원수 , 인스턴스 변수이므로 기본 초기화 0 
	public HumanResourceService(int length) {
		array=new Employee[length];
	}
	/*
	 * 매개변수로 전달받은 사원or매니저or엔지니어를 배열 요소로 추가한다 
	 * 현재 사원수 정보를 저장하는 count를 증가한다 
	 */
	public void add(Employee employee) {//부모 타입으로 선언하여 다양한 자식객체를 받을 수 있음 
		array[count]=employee;//배열 요소로 매개변수로 전달된 정보를 추가 
		count++; //요소가 추가되었으므로 count를 1 증가한다 
	}
	// 현재 사원수만큼 반복해서 정보를 출력한다 
	public void printAll() {
		for(int i=0;i<count;i++) {
			System.out.println(array[i]);//내부적으로 toString()이 호출됨 
		}
	}
}










